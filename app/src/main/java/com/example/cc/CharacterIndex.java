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
            "https://www.smashbros.com/assets_v2/img/fighter/mew_two/main.png",
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

    //Heavy's {3,12,18,19,27,28,54,65,70}
    public static String[] heavyFighters={fighterPath[3],fighterPath[12],fighterPath[18],
            fighterPath[19],fighterPath[27],fighterPath[28],
            fighterPath[54],fighterPath[65],fighterPath[70]};
}
