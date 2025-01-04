import { Module } from '@nestjs/common';
import { ProfsService } from './profs.service';
import { ProfsController } from './profs.controller';

@Module({
  controllers: [ProfsController],
  providers: [ProfsService],
})
export class ProfsModule {}
