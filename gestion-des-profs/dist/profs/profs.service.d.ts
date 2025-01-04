import { CreateProfDto } from './dto/create-prof.dto';
import { UpdateProfDto } from './dto/update-prof.dto';
import { Repository } from 'typeorm';
import { Prof } from './entities/prof.entity';
export declare class ProfsService {
    private profRepository;
    constructor(profRepository: Repository<Prof>);
    create(createProfDto: CreateProfDto): Promise<Prof>;
    findAll(): Promise<Prof[]>;
    findOne(id: number): Promise<Prof>;
    update(id: number, updateProfDto: UpdateProfDto): Promise<Prof>;
    remove(id: number): Promise<void>;
}
