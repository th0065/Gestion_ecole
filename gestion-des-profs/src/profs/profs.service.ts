import { Injectable } from '@nestjs/common';
import { CreateProfDto } from './dto/create-prof.dto';
import { UpdateProfDto } from './dto/update-prof.dto';
import { InjectRepository } from '@nestjs/typeorm';
import { Repository } from 'typeorm';
import { Prof } from './entities/prof.entity';

@Injectable()
export class ProfsService {

 constructor( @InjectRepository(Prof)
 private profRepository: Repository<Prof>, // Inject the Prof repository
  ){

 }

  // Create a new prof
  async create(createProfDto: CreateProfDto): Promise<Prof> {
    const prof = this.profRepository.create(createProfDto);
    return this.profRepository.save(prof);
  }

  // Find all profs
  async findAll(): Promise<Prof[]> {
    return this.profRepository.find();
  }
 // Find one prof by id
 async findOne(id: number): Promise<Prof> {
  return this.profRepository.findOne({ where: { id } });

}

// Update an existing prof
async update(id: number, updateProfDto: UpdateProfDto): Promise<Prof> {
  await this.profRepository.update(id, updateProfDto);
  return this.findOne(id); // Return the updated prof
}

// Remove a prof by id
async remove(id: number): Promise<void> {
  await this.profRepository.delete(id);
}
}
