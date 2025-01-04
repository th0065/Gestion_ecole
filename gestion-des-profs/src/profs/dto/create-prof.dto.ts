import { IsString, IsNotEmpty, IsNumber } from 'class-validator';

export class CreateProfDto {
  @IsString()
  @IsNotEmpty()
  readonly nom: string;

  @IsString()
  @IsNotEmpty()
  readonly prenom: string;

  @IsNumber()
  @IsNotEmpty()
  readonly matiere_id: number; 

  @IsString()
  @IsNotEmpty()
  readonly telephone: string;

  @IsString()
  readonly diplome: string;
}
