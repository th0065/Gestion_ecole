import { Column, Entity, PrimaryGeneratedColumn } from "typeorm";

@Entity({name:'profs'})
export class Prof {
    @PrimaryGeneratedColumn()
    id:number;

    @Column({nullable:false})
    nom:string;

    @Column({nullable:false})
    prenom:string;

    @Column({nullable:false})
    matiere_id:number;

    @Column({nullable:false})
    telephone:string;

    @Column({})
    diplome:string;
}

