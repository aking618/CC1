package com.example.cc;

public class WavIndex {

    public static int[] wavFiles = {R.raw.banjo, R.raw.bayonetta, R.raw.bowser, R.raw.captain,
            R.raw.chrom, R.raw.bowser_jr, R.raw.corrin, R.raw.cloud, R.raw.daisy,
            R.raw.pitb, R.raw.dsamus, R.raw.diddy, R.raw.donkey, R.raw.hero, R.raw.mariod,
            R.raw.duckhunt, R.raw.falco, R.raw.ganon, R.raw.fox, R.raw.gaogaen, R.raw.greninja,
            R.raw.iceclimber, R.raw.ike, R.raw.inkling, R.raw.jigglypuff, R.raw.joker, R.raw.ken,
            R.raw.dedede, R.raw.krool, R.raw.link, R.raw.littlemac, R.raw.kirby, R.raw.lucario,
            R.raw.lucas, R.raw.luigi, R.raw.lucina, R.raw.mario, R.raw.marth, R.raw.megaman,
            R.raw.metaknight, R.raw.mewtwo, R.raw.mii, R.raw.gamewatch, R.raw.characall_olimar,
            R.raw.ness, R.raw.pacman, R.raw.packun, R.raw.palutena, R.raw.peach, R.raw.pichu,
            R.raw.pikachu, R.raw.pit, R.raw.poketrainer, R.raw.richter, R.raw.ridley, R.raw.robin,
            R.raw.robot, R.raw.rosalinaandluma, R.raw.roy, R.raw.ryu, R.raw.samus, R.raw.sheik,
            R.raw.shizue, R.raw.shulk, R.raw.simon, R.raw.snake, R.raw.sonic, R.raw.terry, R.raw.toonlink,
            R.raw.villager, R.raw.wario, R.raw.wiifit, R.raw.wolf, R.raw.yoshi, R.raw.younglink,
            R.raw.zelda, R.raw.szerosuit
    };
    public static int[] heavyFightersSound = {wavFiles[2], wavFiles[12], wavFiles[17],
            wavFiles[19], wavFiles[22], wavFiles[27], wavFiles[28],
            wavFiles[54], wavFiles[65], wavFiles[70]};
    private static int[] animalCrossing = {wavFiles[62], wavFiles[69]};
    private static int[] castleVania = {wavFiles[53], wavFiles[64]};
    private static int[] earthBound = {wavFiles[44], wavFiles[33]};
    private static int[] fireEmblem = {wavFiles[4], wavFiles[6], wavFiles[22], wavFiles[35],
            wavFiles[37], wavFiles[55], wavFiles[59]};
    private static int[] kidIcarus = {wavFiles[51], wavFiles[47], wavFiles[9]};
    private static int[] kirby = {wavFiles[31], wavFiles[27], wavFiles[39]};
    private static int[] legendOfZelda = {wavFiles[17], wavFiles[29], wavFiles[61],
            wavFiles[68], wavFiles[74], wavFiles[75]};
    private static int[] metriod = {wavFiles[10], wavFiles[54], wavFiles[60], wavFiles[76]};
    private static int[] pokemon = {wavFiles[19], wavFiles[20], wavFiles[24], wavFiles[32],
            wavFiles[40], wavFiles[49], wavFiles[50], wavFiles[52]};
    private static int[] starFox = {wavFiles[16], wavFiles[18], wavFiles[72]};
    private static int[] streetFighter = {wavFiles[59], wavFiles[26]};
    private static int[] superMario = {wavFiles[2], wavFiles[5], wavFiles[8], wavFiles[11], wavFiles[12],
            wavFiles[14], wavFiles[28], wavFiles[34], wavFiles[36], wavFiles[46],
            wavFiles[48], wavFiles[57], wavFiles[70], wavFiles[73]};

    public static int franchiseFighterSounds(String a, int z) {
        int index;
        switch (a) {
            case "Animal Crossing":
                index = animalCrossing[z];
                break;
            case "Banjo-Kazooie":
                index = wavFiles[0];
                break;
            case "Bayonetta":
                index = wavFiles[1];
                break;
            case "Castlevania":
                index = castleVania[z];
                break;
            case "Dragon Quest":
                index = wavFiles[13];
                break;
            case "Duck Hunt":
                index = wavFiles[15];
                break;
            case "EarthBound":
                index = earthBound[z];
                break;
            case "Fatal Fury":
                index = wavFiles[67];
                break;
            case "Final Fantasy":
                index = wavFiles[7];
                break;
            case "Fire Emblem":
                index = fireEmblem[z];
                break;
            case "F-Zero":
                index = wavFiles[3];
                break;
            case "Game and Watch":
                index = wavFiles[42];
                break;
            case "Ice Climber":
                index = wavFiles[21];
                break;
            case "Kid Icarus":
                index = kidIcarus[z];
                break;
            case "Kirby":
                index = kirby[z];
                break;
            case "Legend of Zelda":
                index = legendOfZelda[z];
                break;
            case "Mega Man":
                index = wavFiles[38];
                break;
            case "Metal Gear":
                index = wavFiles[65];
                break;
            case "Metriod":
                index = metriod[z];
                break;
            case "Mii":
                index = wavFiles[41];
                break;
            case "Pac-Man":
                index = wavFiles[45];
                break;
            case "Persona":
                index = wavFiles[25];
                break;
            case "Pikmin":
                index = wavFiles[43];
                break;
            case "Pokemon":
                index = pokemon[z];
                break;
            case "Punch-Out!":
                index = wavFiles[30];
                break;
            case "R.O.B.":
                index = wavFiles[56];
                break;
            case "Sonic the Hedgehog":
                index = wavFiles[66];
                break;
            case "Splatoon":
                index = wavFiles[23];
                break;
            case "Star Fox":
                index = starFox[z];
                break;
            case "Street Fighter":
                index = streetFighter[z];
                break;
            case "Super Mario":
                index = superMario[z];
                break;
            case "Wii Fit":
                index = wavFiles[71];
                break;
            case "Xenoblade Chronicles":
                index = wavFiles[63];
                break;
            default:
                index = wavFiles[0];
        }

        return index;
    }

}
