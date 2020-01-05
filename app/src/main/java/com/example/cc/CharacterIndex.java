package com.example.cc;

import java.util.Random;

public class CharacterIndex {

    public static int randomizeFighterIndex() {
        Random rand = new Random();
        return rand.nextInt(fighterPath.length);
    }

    public static int randomizeHeavyFighterIndex(){
        Random rand = new Random();
        return rand.nextInt(heavyFighters.length);
    }

    public static int randomizeFranchiseFighter(String a){
        Random rand = new Random();
        int index;
        switch(a){
            case "Animal Crossing": index=animalCrossing[(rand.nextInt(animalCrossing.length))];
                break;
            case "Banjo-Kazooie": index=fighterPath[0];
                break;
            case "Bayonetta": index=fighterPath[1];
                break;
            case "Castlevania": index=castleVania[(rand.nextInt(castleVania.length))];
                break;
            case "Dragon Quest": index=fighterPath[13];
                break;
            case "Duck Hunt": index=fighterPath[15];
                break;
            case "EarthBound": index=earthBound[(rand.nextInt(earthBound.length))];
                break;
            case "Fatal Fury": index=fighterPath[67];
                break;
            case "Final Fantasy": index=fighterPath[7];
                break;
            case "Fire Emblem": index=fireEmblem[(rand.nextInt(fireEmblem.length))];
                break;
            case "F-Zero": index=fighterPath[3];
                break;
            case "Game and Watch": index=fighterPath[42];
                break;
            case"Ice Climber":index=fighterPath[21];
                break;
            case"Kid Icarus":index=kidIcarus[(rand.nextInt(kidIcarus.length))];
                break;
            case "Kirby":index=kirby[rand.nextInt(kirby.length)];
                break;
            case"Legend of Zelda":index=legendOfZelda[(rand.nextInt(legendOfZelda.length))];
                break;
            case"Mega Man":index=fighterPath[38];
                break;
            case"Metal Gear":index=fighterPath[65];
                break;
            case"Metriod":index=metriod[(rand.nextInt(metriod.length))];
                break;
            case"Mii":index=fighterPath[41];
                break;
            case"Pac-Man":index=fighterPath[45];
                break;
            case"Persona":index=fighterPath[25];
                break;
            case"Pikmin":index=fighterPath[43];
                break;
            case"Pokemon":index=pokemon[(rand.nextInt(pokemon.length))];
                break;
            case"Punch-Out!":index=fighterPath[30];
                break;
            case"R.O.B.":index=fighterPath[56];
                break;
            case"Sonic the Hedgehog":index=fighterPath[66];
                break;
            case"Splatoon":index=fighterPath[23];
                break;
            case"Star Fox":index=starFox[(rand.nextInt(starFox.length))];
                break;
            case"Street Fighter":index=streetFighter[(rand.nextInt(streetFighter.length))];
                break;
            case "Super Mario": index=superMario[(rand.nextInt(superMario.length))];
                break;
            case"Wii Fit":index=fighterPath[71];
                break;
            case"Xenoblade Chronicles":index=fighterPath[63];
                break;
            default: index=fighterPath[0];
        }

        return index;
    }

    public static int[] fighterPath = {R.drawable.main,R.drawable.main1,R.drawable.main2,R.drawable.main3,R.drawable.main4,R.drawable.main5,R.drawable.main6,R.drawable.main7,
            R.drawable.main8,R.drawable.main9,R.drawable.main10,R.drawable.main11,R.drawable.main12,R.drawable.main13,R.drawable.main14,R.drawable.main15,R.drawable.main16,R.drawable.main17,
            R.drawable.main18,R.drawable.main19,R.drawable.main20,R.drawable.main21,R.drawable.main22,R.drawable.main23,R.drawable.main24,R.drawable.main25,R.drawable.main26,R.drawable.main27,
            R.drawable.main28,R.drawable.main29,R.drawable.main30,R.drawable.main31,R.drawable.main32,R.drawable.main33,R.drawable.main34,R.drawable.main35,R.drawable.main36,R.drawable.main37,
            R.drawable.main38,R.drawable.main39,R.drawable.main40,R.drawable.main41,R.drawable.main42,R.drawable.main43,R.drawable.main44,R.drawable.main45,R.drawable.main46,R.drawable.main47,
            R.drawable.main48,R.drawable.main49,R.drawable.main50,R.drawable.main51,R.drawable.main52,R.drawable.main53,R.drawable.main54,R.drawable.main55, R.drawable.main56,R.drawable.main57,
            R.drawable.main58,R.drawable.main59,R.drawable.main60,R.drawable.main61,R.drawable.main62,R.drawable.main63,R.drawable.main64,R.drawable.main65, R.drawable.main66,R.drawable.main67,
            R.drawable.main68,R.drawable.main69,R.drawable.main70,R.drawable.main71,R.drawable.main72,R.drawable.main73,R.drawable.main74,R.drawable.main75, R.drawable.main76
    };


    public static int[] heavyFighters={fighterPath[2],fighterPath[12],fighterPath[17],
            fighterPath[19],fighterPath[22],fighterPath[27],fighterPath[28],
            fighterPath[54],fighterPath[65],fighterPath[70]};

    private static int[] animalCrossing={fighterPath[62],fighterPath[69]};

    private static int[] castleVania={fighterPath[53],fighterPath[64]};

    private static int[] earthBound={fighterPath[44],fighterPath[33]};

    private static int[] fireEmblem={fighterPath[4],fighterPath[6],fighterPath[22],fighterPath[35],
            fighterPath[37],fighterPath[55],fighterPath[59]};

    private static int[] kidIcarus={fighterPath[51],fighterPath[47],fighterPath[9]};

    private static int[] kirby={fighterPath[31],fighterPath[27],fighterPath[39]};

    private static int[] legendOfZelda={fighterPath[17],fighterPath[29],fighterPath[61],
            fighterPath[68],fighterPath[74], fighterPath[75]};

    private static int[] metriod={fighterPath[10],fighterPath[54],fighterPath[60],fighterPath[76]};

    private static int[] pokemon={fighterPath[19],fighterPath[20],fighterPath[24],fighterPath[32],
            fighterPath[40],fighterPath[49],fighterPath[50],fighterPath[52]};

    private static int[] starFox={fighterPath[16],fighterPath[18],fighterPath[72]};

    private static int[] streetFighter={fighterPath[59],fighterPath[26]};

    private static int[] superMario={fighterPath[2],fighterPath[5],fighterPath[8],fighterPath[11],fighterPath[12],
            fighterPath[14],fighterPath[28],fighterPath[34],fighterPath[36],fighterPath[46],
            fighterPath[48],fighterPath[57],fighterPath[70],fighterPath[73]};

}

