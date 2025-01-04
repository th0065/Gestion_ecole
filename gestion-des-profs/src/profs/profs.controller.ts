import { Controller, Get, Post, Body, Patch, Param, Delete } from '@nestjs/common';
import { ProfsService } from './profs.service';
import { CreateProfDto } from './dto/create-prof.dto';
import { UpdateProfDto } from './dto/update-prof.dto';

@Controller('profs')
export class ProfsController {
  constructor(private readonly profsService: ProfsService) {}

  @Post()
  create(@Body() createProfDto: CreateProfDto) {
    return this.profsService.create(createProfDto);
  }

  @Get()
  findAll() {
    return this.profsService.findAll();
  }

  @Get(':id')
  findOne(@Param('id') id: string) {
    return this.profsService.findOne(+id);
  }

  @Patch(':id')
  update(@Param('id') id: string, @Body() updateProfDto: UpdateProfDto) {
    return this.profsService.update(+id, updateProfDto);
  }

  @Delete(':id')
  remove(@Param('id') id: string) {
    return this.profsService.remove(+id);
  }
}
