import { ProfsService } from './profs.service';
import { CreateProfDto } from './dto/create-prof.dto';
import { UpdateProfDto } from './dto/update-prof.dto';
export declare class ProfsController {
    private readonly profsService;
    constructor(profsService: ProfsService);
    create(createProfDto: CreateProfDto): Promise<import("./entities/prof.entity").Prof>;
    findAll(): Promise<import("./entities/prof.entity").Prof[]>;
    findOne(id: string): Promise<import("./entities/prof.entity").Prof>;
    update(id: string, updateProfDto: UpdateProfDto): Promise<import("./entities/prof.entity").Prof>;
    remove(id: string): Promise<void>;
}
