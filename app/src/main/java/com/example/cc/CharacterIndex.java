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

    public static String randomizeFranchiseFighter(String a){
        Random rand = new Random();
        String path="";
        switch(a){
            case "Animal Crossing": path=animalCrossing[(rand.nextInt(animalCrossing.length))];
                break;
            case "Banjo-Kazooie": path=fighterPath[0];
                break;
            case "Bayonetta": path=fighterPath[1];
                break;
            case "Castlevania": path=castleVania[(rand.nextInt(castleVania.length))];
                break;
            case "Dragon Quest": path=fighterPath[13];
                break;
            case "Duck Hunt": path=fighterPath[15];
                break;
            case "EarthBound": path=earthBound[(rand.nextInt(earthBound.length))];
                break;
            case "Fatal Fury": path=fighterPath[67];
                break;
            case "Final Fantasy": path=fighterPath[6];
                break;
            case "Fire Emblem": path=fireEmblem[(rand.nextInt(fireEmblem.length))];
                break;
            case "F-Zero": path=fighterPath[4];
                break;
            case "Game and Watch": path=fighterPath[42];
                break;
            case"Ice Climber":path=fighterPath[21];
                break;
            case"Kid Icarus":path=kidIcarus[(rand.nextInt(kidIcarus.length))];
                break;
            case"Legend of Zelda":path=legendOfZelda[(rand.nextInt(legendOfZelda.length))];
                break;
            case"Mega Man":path=fighterPath[38];
                break;
            case"Metal Gear":path=fighterPath[65];
                break;
            case"Metriod":path=metriod[(rand.nextInt(metriod.length))];
                break;
            case"Mii":path=fighterPath[41];
                break;
            case"Pac-Man":path=fighterPath[45];
                break;
            case"Persona":path=fighterPath[25];
                break;
            case"Pikmin":path=fighterPath[44];
                break;
            case"Pokemon":path=pokemon[(rand.nextInt(pokemon.length))];
                break;
            case"Punch-Out!":path=fighterPath[31];
                break;
            case"R.O.B.":path=fighterPath[55];
                break;
            case"Sonic the Hedgehog":path=fighterPath[66];
                break;
            case"Splatoon":path=fighterPath[23];
                break;
            case"Star Fox":path=starFox[(rand.nextInt(starFox.length))];
                break;
            case"Street Fighter":path=streetFighter[(rand.nextInt(streetFighter.length))];
                break;
            case "Super Mario": path=superMario[(rand.nextInt(superMario.length))];
                break;
            case"Wii Fit":path=fighterPath[71];
                break;
            case"Xenoblade Chronicles":path=fighterPath[63];
                break;
            default: path=fighterPath[0];
        }

        return path;
    }

    public static String[] fighterPath = {
            "https://www.smashbros.com/assets_v2/img/fighter/banjo_and_kazooie/main.png",
            "https://www.smashbros.com/assets_v2/img/fighter/bayonetta/main.png",
            "https://www.smashbros.com/assets_v2/img/fighter/bowser_jr/main.png",
            "https://www.smashbros.com/assets_v2/img/fighter/bowser/main.png",
            "https://www.smashbros.com/assets_v2/img/fighter/captain_falcon/main.png",
            "https://www.smashbros.com/assets_v2/img/fighter/chrom/main.png",
            "https://www.smashbros.com/assets_v2/img/fighter/cloud/main.png",
            "https://www.smashbros.com/assets_v2/img/fighter/corrin/main.png",
            "https://www.smashbros.com/assets_v2/img/fighter/daisy/main.png",
            "https://www.smashbros.com/assets_v2/img/fighter/dark_pit/main.png",
            "https://www.smashbros.com/assets_v2/img/fighter/dark_samus/main.png",
            "https://www.smashbros.com/assets_v2/img/fighter/diddy_kong/main.png",
            "https://www.smashbros.com/assets_v2/img/fighter/donkey_kong/main.png",
            "https://www.smashbros.com/assets_v2/img/fighter/dq_hero/main.png",
            "https://www.smashbros.com/assets_v2/img/fighter/dr_mario/main.png",
            "https://www.smashbros.com/assets_v2/img/fighter/duck_hunt/main.png",
            "https://www.smashbros.com/assets_v2/img/fighter/falco/main.png",
            "https://www.smashbros.com/assets_v2/img/fighter/fox/main.png",
            "https://www.smashbros.com/assets_v2/img/fighter/ganondorf/main.png",
            "https://www.smashbros.com/assets_v2/img/fighter/gaogaen/main.png",
            "https://www.smashbros.com/assets_v2/img/fighter/greninja/main.png",
            "https://www.smashbros.com/assets_v2/img/fighter/ice_climbers/main.png",
            "https://www.smashbros.com/assets_v2/img/fighter/ike/main.png",
            "https://www.smashbros.com/assets_v2/img/fighter/inkling/main.png",
            "https://www.smashbros.com/assets_v2/img/fighter/jigglypuff/main.png",
            "https://www.smashbros.com/assets_v2/img/fighter/joker/main.png",
            "https://www.smashbros.com/assets_v2/img/fighter/ken/main.png",
            "https://www.smashbros.com/assets_v2/img/fighter/king_dedede/main.png",
            "https://www.smashbros.com/assets_v2/img/fighter/king_k_rool/main.png",
            "https://www.smashbros.com/assets_v2/img/fighter/kirby/main.png",
            "https://www.smashbros.com/assets_v2/img/fighter/link/main.png",
            "https://www.smashbros.com/assets_v2/img/fighter/little_mac/main.png",
            "https://www.smashbros.com/assets_v2/img/fighter/lucario/main.png",
            "https://www.smashbros.com/assets_v2/img/fighter/lucas/main.png",
            "https://www.smashbros.com/assets_v2/img/fighter/lucina/main.png",
            "https://www.smashbros.com/assets_v2/img/fighter/luigi/main.png",
            "https://www.smashbros.com/assets_v2/img/fighter/mario/main.png",
            "https://www.smashbros.com/assets_v2/img/fighter/marth/main.png",
            "https://www.smashbros.com/assets_v2/img/fighter/mega_man/main.png",
            "https://www.smashbros.com/assets_v2/img/fighter/meta_knight/main.png",
            "https://www.smashbros.com/assets_v2/img/fighter/mewtwo/main.png",
            "https://www.smashbros.com/assets_v2/img/fighter/mii_fighter/main.png",
            "https://www.smashbros.com/assets_v2/img/fighter/mr_game_and_watch/main.png",
            "https://www.smashbros.com/assets_v2/img/fighter/ness/main.png",
            "https://www.smashbros.com/assets_v2/img/fighter/olimar/main.png",
            "https://www.smashbros.com/assets_v2/img/fighter/pac_man/main.png",
            "https://www.smashbros.com/assets_v2/img/fighter/packun_flower/main.png",
            "https://www.smashbros.com/assets_v2/img/fighter/palutena/main.png",
            "https://www.smashbros.com/assets_v2/img/fighter/peach/main.png",
            "https://www.smashbros.com/assets_v2/img/fighter/pichu/main.png",
            "https://www.smashbros.com/assets_v2/img/fighter/pikachu/main.png",
            "https://www.smashbros.com/assets_v2/img/fighter/pit/main.png",
            "https://www.smashbros.com/assets_v2/img/fighter/pokemon_trainer/main.png",
            "https://www.smashbros.com/assets_v2/img/fighter/richter/main.png",
            "https://www.smashbros.com/assets_v2/img/fighter/ridley/main.png",
            "https://www.smashbros.com/assets_v2/img/fighter/rob/main.png",
            "https://www.smashbros.com/assets_v2/img/fighter/robin/main.png",
            "https://www.smashbros.com/assets_v2/img/fighter/rosalina_and_luma/main.png",
            "https://www.smashbros.com/assets_v2/img/fighter/roy/main.png",
            "https://www.smashbros.com/assets_v2/img/fighter/ryu/main.png",
            "https://www.smashbros.com/assets_v2/img/fighter/samus/main.png",
            "https://www.smashbros.com/assets_v2/img/fighter/sheik/main.png",
            "https://www.smashbros.com/assets_v2/img/fighter/shizue/main.png",
            "https://www.smashbros.com/assets_v2/img/fighter/shulk/main.png",
            "https://www.smashbros.com/assets_v2/img/fighter/simon/main.png",
            "https://www.smashbros.com/assets_v2/img/fighter/snake/main.png",
            "https://www.smashbros.com/assets_v2/img/fighter/sonic/main.png",
            "https://www.smashbros.com/assets_v2/img/fighter/terry/main.png",
            "https://www.smashbros.com/assets_v2/img/fighter/toon_link/main.png",
            "https://www.smashbros.com/assets_v2/img/fighter/villager/main.png",
            "https://www.smashbros.com/assets_v2/img/fighter/wario/main.png",
            "https://www.smashbros.com/assets_v2/img/fighter/wii_fit_trainer/main.png",
            "https://www.smashbros.com/assets_v2/img/fighter/wolf/main.png",
            "https://www.smashbros.com/assets_v2/img/fighter/yoshi/main.png",
            "https://www.smashbros.com/assets_v2/img/fighter/young_link/main.png",
            "https://www.smashbros.com/assets_v2/img/fighter/zelda/main.png",
            "https://www.smashbros.com/assets_v2/img/fighter/zero_suit_samus/main.png"
    };

    public static String[] heavyFighters={fighterPath[3],fighterPath[12],fighterPath[18],
            fighterPath[19],fighterPath[27],fighterPath[28],
            fighterPath[54],fighterPath[65],fighterPath[70]};

    public static String[] animalCrossing={fighterPath[62],fighterPath[69]};

    public static String[] castleVania={fighterPath[53],fighterPath[64]};

    public static String[] earthBound={fighterPath[43],fighterPath[33]};

    public static String[] fireEmblem={fighterPath[5],fighterPath[7],fighterPath[22],fighterPath[34],
            fighterPath[37],fighterPath[56],fighterPath[56]};

    public static String[] kidIcarus={fighterPath[51],fighterPath[47],fighterPath[9]};

    public static String[] legendOfZelda={fighterPath[18],fighterPath[30],fighterPath[61],
            fighterPath[68],fighterPath[74], fighterPath[75]};

    public static String[] metriod={fighterPath[20],fighterPath[54],fighterPath[60],fighterPath[76]};

    public static String[] pokemon={fighterPath[19],fighterPath[20],fighterPath[24],fighterPath[32],
            fighterPath[40],fighterPath[49],fighterPath[50],fighterPath[52]};

    public static String[] starFox={fighterPath[16],fighterPath[17],fighterPath[72]};

    public static String[] streetFighter={fighterPath[59],fighterPath[26]};

    public static String[] superMario={fighterPath[2],fighterPath[3],fighterPath[8],fighterPath[11],fighterPath[12],
            fighterPath[14],fighterPath[28],fighterPath[35],fighterPath[36],fighterPath[46],
            fighterPath[48],fighterPath[59],fighterPath[72],fighterPath[75]};

}

