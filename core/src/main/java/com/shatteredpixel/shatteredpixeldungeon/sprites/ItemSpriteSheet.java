/*
 * Pixel Dungeon
 * Copyright (C) 2012-2015 Oleg Dolya
 *
 * Shattered Pixel Dungeon
 * Copyright (C) 2014-2022 Evan Debenham
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>
 */

package com.shatteredpixel.shatteredpixeldungeon.sprites;

import com.shatteredpixel.shatteredpixeldungeon.Assets;
import com.watabou.noosa.TextureFilm;

public class ItemSpriteSheet {

	private static final int WIDTH = 16;
	public static final int SIZE = 16;

	public static TextureFilm film = new TextureFilm( Assets.Sprites.ITEMS, SIZE, SIZE );

	private static int xy(int x, int y){
		x -= 1; y -= 1;
		return x + WIDTH*y;
	}

	private static void assignItemRect( int item, int width, int height ){
		int x = (item % WIDTH) * SIZE;
		int y = (item / WIDTH) * SIZE;
		film.add( item, x, y, x+width, y+height);
	}

	private static final int PLACEHOLDERS   =                               xy(1, 1);   //16 slots
	//SOMETHING is the default item sprite at position 0. May show up ingame if there are bugs.
	public static final int SOMETHING       = PLACEHOLDERS+0;
	public static final int WEAPON_HOLDER   = PLACEHOLDERS+1;
	public static final int ARMOR_HOLDER    = PLACEHOLDERS+2;
	public static final int MISSILE_HOLDER  = PLACEHOLDERS+3;
	public static final int WAND_HOLDER     = PLACEHOLDERS+4;
	public static final int RING_HOLDER     = PLACEHOLDERS+5;
	public static final int ARTIFACT_HOLDER = PLACEHOLDERS+6;
	public static final int FOOD_HOLDER     = PLACEHOLDERS+7;
	public static final int BOMB_HOLDER     = PLACEHOLDERS+8;
	public static final int POTION_HOLDER   = PLACEHOLDERS+9;
	public static final int SCROLL_HOLDER   = PLACEHOLDERS+11;
	public static final int SEED_HOLDER     = PLACEHOLDERS+10;
	public static final int STONE_HOLDER    = PLACEHOLDERS+12;
	public static final int CATA_HOLDER     = PLACEHOLDERS+13;
	public static final int ELIXIR_HOLDER   = PLACEHOLDERS+14;
	public static final int SPELL_HOLDER    = PLACEHOLDERS+15;
	static{
		assignItemRect(SOMETHING,       8,  13);
		assignItemRect(WEAPON_HOLDER,   14, 14);
		assignItemRect(ARMOR_HOLDER,    14, 12);
		assignItemRect(MISSILE_HOLDER,  15, 15);
		assignItemRect(WAND_HOLDER,     14, 14);
		assignItemRect(RING_HOLDER,     8,  10);
		assignItemRect(ARTIFACT_HOLDER, 15, 15);
		assignItemRect(FOOD_HOLDER,     15, 11);
		assignItemRect(BOMB_HOLDER,     10, 13);
		assignItemRect(POTION_HOLDER,   12, 14);
		assignItemRect(SEED_HOLDER,     10, 10);
		assignItemRect(SCROLL_HOLDER,   15, 14);
		assignItemRect(STONE_HOLDER,    14, 12);
		assignItemRect(CATA_HOLDER,     6,  15);
		assignItemRect(ELIXIR_HOLDER,   12, 14);
		assignItemRect(SPELL_HOLDER,    8,  16);
	}

	private static final int UNCOLLECTIBLE  =                               xy(1, 2);   //16 slots
	public static final int GOLD            = UNCOLLECTIBLE+0;
	public static final int DEWDROP         = UNCOLLECTIBLE+1;
	public static final int PETAL           = UNCOLLECTIBLE+2;
	public static final int SANDBAG         = UNCOLLECTIBLE+3;
	public static final int SPIRIT_ARROW    = UNCOLLECTIBLE+4;
	public static final int ENERGY          = UNCOLLECTIBLE+5;
	public static final int GUIDE_PAGE      = UNCOLLECTIBLE+6;
	public static final int ALCH_PAGE       = UNCOLLECTIBLE+7;
	public static final int NOTHING			= UNCOLLECTIBLE+8; //for invisible ballistic
	public static final int TENGU_BOMB      = UNCOLLECTIBLE+9;
	public static final int TENGU_SHOCKER   = UNCOLLECTIBLE+10;
	static{
		assignItemRect(GOLD,        15, 13);
		assignItemRect(DEWDROP,     10, 10);
		assignItemRect(PETAL,       8,  8);
		assignItemRect(SANDBAG,     10, 10);
		assignItemRect(SPIRIT_ARROW,11, 11);
		assignItemRect(ENERGY,      16, 16);
		assignItemRect(GUIDE_PAGE,  10, 11);
		assignItemRect(ALCH_PAGE,   10, 11);
		assignItemRect(NOTHING,     16, 16);
		assignItemRect(TENGU_BOMB,      10, 10);
		assignItemRect(TENGU_SHOCKER,   10, 10);
	}

	private static final int CONTAINERS     =                               xy(1, 3);   //16 slots
	public static final int BONES           = CONTAINERS+0;
	public static final int REMAINS         = CONTAINERS+1;
	public static final int TOMB            = CONTAINERS+2;
	public static final int GRAVE           = CONTAINERS+3;
	public static final int CHEST           = CONTAINERS+4;
	public static final int LOCKED_CHEST    = CONTAINERS+5;
	public static final int CRYSTAL_CHEST   = CONTAINERS+6;
	public static final int EBONY_CHEST     = CONTAINERS+7;
	static{
		assignItemRect(BONES,           14, 11);
		assignItemRect(REMAINS,         14, 11);
		assignItemRect(TOMB,            14, 15);
		assignItemRect(GRAVE,           14, 15);
		assignItemRect(CHEST,           16, 14);
		assignItemRect(LOCKED_CHEST,    16, 14);
		assignItemRect(CRYSTAL_CHEST,   16, 14);
		assignItemRect(EBONY_CHEST,     16, 14);
	}

	private static final int MISC_CONSUMABLE =                              xy(1, 4);   //16 slots
	public static final int ANKH            = MISC_CONSUMABLE +0;
	public static final int STYLUS          = MISC_CONSUMABLE +1;
	public static final int SEAL            = MISC_CONSUMABLE +2;
	public static final int TORCH           = MISC_CONSUMABLE +3;
	public static final int BEACON          = MISC_CONSUMABLE +4;
	public static final int HONEYPOT        = MISC_CONSUMABLE +5;
	public static final int SHATTPOT        = MISC_CONSUMABLE +6;
	public static final int IRON_KEY        = MISC_CONSUMABLE +7;
	public static final int GOLDEN_KEY      = MISC_CONSUMABLE +8;
	public static final int CRYSTAL_KEY     = MISC_CONSUMABLE +9;
	public static final int SKELETON_KEY    = MISC_CONSUMABLE +10;
	public static final int MASK            = MISC_CONSUMABLE +11;
	public static final int CROWN           = MISC_CONSUMABLE +12;
	public static final int AMULET          = MISC_CONSUMABLE +13;
	public static final int MASTERY         = MISC_CONSUMABLE +14;
	public static final int KIT             = MISC_CONSUMABLE +15;
	static{
		assignItemRect(ANKH,            10, 16);
		assignItemRect(STYLUS,          12, 13);
		
		assignItemRect(SEAL,            9,  15);
		assignItemRect(TORCH,           12, 15);
		assignItemRect(BEACON,          16, 15);
		
		assignItemRect(HONEYPOT,        14, 12);
		assignItemRect(SHATTPOT,        14, 12);
		assignItemRect(IRON_KEY,        8,  14);
		assignItemRect(GOLDEN_KEY,      8,  14);
		assignItemRect(CRYSTAL_KEY,     8,  14);
		assignItemRect(SKELETON_KEY,    8,  14);
		assignItemRect(MASK,            11,  9);
		assignItemRect(CROWN,           13,  7);
		assignItemRect(AMULET,          16, 16);
		assignItemRect(MASTERY,         13, 16);
		assignItemRect(KIT,             16, 15);
	}
	
	private static final int BOMBS          =                               xy(1, 5);   //16 slots
	public static final int BOMB            = BOMBS+0;
	public static final int DBL_BOMB        = BOMBS+1;
	public static final int FIRE_BOMB       = BOMBS+2;
	public static final int FROST_BOMB      = BOMBS+3;
	public static final int REGROWTH_BOMB   = BOMBS+4;
	public static final int FLASHBANG       = BOMBS+5;
	public static final int SHOCK_BOMB      = BOMBS+6;
	public static final int HOLY_BOMB       = BOMBS+7;
	public static final int WOOLY_BOMB      = BOMBS+8;
	public static final int NOISEMAKER      = BOMBS+9;
	public static final int ARCANE_BOMB     = BOMBS+10;
	public static final int SHRAPNEL_BOMB   = BOMBS+11;
	
	static{
		assignItemRect(BOMB,            10, 13);
		assignItemRect(DBL_BOMB,        14, 13);
		assignItemRect(FIRE_BOMB,       13, 12);
		assignItemRect(FROST_BOMB,      13, 12);
		assignItemRect(REGROWTH_BOMB,   13, 12);
		assignItemRect(FLASHBANG,       13, 12);
		assignItemRect(SHOCK_BOMB,      10, 13);
		assignItemRect(HOLY_BOMB,       10, 13);
		assignItemRect(WOOLY_BOMB,      10, 13);
		assignItemRect(NOISEMAKER,      10, 13);
		assignItemRect(ARCANE_BOMB,     10, 13);
		assignItemRect(SHRAPNEL_BOMB,   10, 13);
	}


	private static final int SPECIAL_ITEMS      =                               xy(1, 6);   //8 slots
	public static final int KNIGHT_SHIELD 	= SPECIAL_ITEMS+0;
	public static final int HEAL_BOOK	 	= SPECIAL_ITEMS+1;
	public static final int GAMMA_RAY_GUN 	= SPECIAL_ITEMS+2;
	public static final int HAND_MIRROR 	= SPECIAL_ITEMS+3;

	static{
		assignItemRect(KNIGHT_SHIELD,		16, 15);
		assignItemRect(HEAL_BOOK,			13, 15);
		assignItemRect(GAMMA_RAY_GUN,		12, 15);
		assignItemRect(HAND_MIRROR,			10, 16);
	}

	private static final int WEP_TIER1      =                               xy(1, 7);   //8 slots
	public static final int WORN_SHORTSWORD = WEP_TIER1+0;
	public static final int CUDGEL          = WEP_TIER1+1;
	public static final int GLOVES          = WEP_TIER1+2;
	public static final int RAPIER          = WEP_TIER1+3;
	public static final int DAGGER          = WEP_TIER1+4;
	public static final int MAGES_STAFF     = WEP_TIER1+5;
	public static final int SHOVEL			= WEP_TIER1+6;
	public static final int SABER			= WEP_TIER1+7;
	static{
		assignItemRect(WORN_SHORTSWORD,13, 13);
		assignItemRect(GLOVES,         12, 16);
		assignItemRect(DAGGER,         12, 13);
		assignItemRect(MAGES_STAFF,    15, 16);
		assignItemRect(SHOVEL,   	   16, 16);
		assignItemRect(SABER,   	   13, 15);
	}

	private static final int WEP_TIER2      =                               xy(9, 7);   //8 slots
	public static final int SHORTSWORD      = WEP_TIER2+0;
	public static final int HAND_AXE        = WEP_TIER2+1;
	public static final int SPEAR           = WEP_TIER2+2;
	public static final int QUARTERSTAFF    = WEP_TIER2+3;
	public static final int DIRK            = WEP_TIER2+4;
	public static final int KNIFE           = WEP_TIER2+5;

	static{
		assignItemRect(SHORTSWORD,      13, 13);
		assignItemRect(HAND_AXE,        12, 14);
		assignItemRect(SPEAR,           16, 16);
		assignItemRect(QUARTERSTAFF,    16, 16);
		assignItemRect(DIRK,            13, 14);
		assignItemRect(KNIFE,           12, 13);
	}

	private static final int WEP_TIER3      =                               xy(1, 8);   //8 slots
	public static final int SWORD           = WEP_TIER3+0;
	public static final int MACE            = WEP_TIER3+1;
	public static final int SCIMITAR        = WEP_TIER3+2;
	public static final int ROUND_SHIELD    = WEP_TIER3+3;
	public static final int SAI             = WEP_TIER3+4;
	public static final int WHIP            = WEP_TIER3+5;
	public static final int BIBLE           = WEP_TIER3+6;

	static{
		assignItemRect(SWORD,           14, 14);
		assignItemRect(MACE,            15, 15);
		assignItemRect(SCIMITAR,        13, 16);
		assignItemRect(ROUND_SHIELD,    16, 16);
		assignItemRect(SAI,             16, 16);
		assignItemRect(WHIP,            14, 14);
		assignItemRect(BIBLE,           13, 16);
	}

	private static final int WEP_TIER4      =                               xy(9, 8);   //8 slots
	public static final int LONGSWORD       = WEP_TIER4+0;
	public static final int BATTLE_AXE      = WEP_TIER4+1;
	public static final int FLAIL           = WEP_TIER4+2;
	public static final int RUNIC_BLADE     = WEP_TIER4+3;
	public static final int ASSASSINS_BLADE = WEP_TIER4+4;
	public static final int CROSSBOW        = WEP_TIER4+5;

	static{
		assignItemRect(LONGSWORD,       15, 15);
		assignItemRect(BATTLE_AXE,      16, 16);
		assignItemRect(FLAIL,           14, 14);
		assignItemRect(RUNIC_BLADE,     14, 14);
		assignItemRect(ASSASSINS_BLADE, 14, 15);
		assignItemRect(CROSSBOW,        15, 15);
	}

	private static final int WEP_TIER5      =                               xy(1, 9);   //8 slots
	public static final int GREATSWORD      = WEP_TIER5+0;
	public static final int WAR_HAMMER      = WEP_TIER5+1;
	public static final int GLAIVE          = WEP_TIER5+2;
	public static final int GREATAXE        = WEP_TIER5+3;
	public static final int GREATSHIELD     = WEP_TIER5+4;
	public static final int GAUNTLETS       = WEP_TIER5+5;

	static{
		assignItemRect(GREATSWORD,  16, 16);
		assignItemRect(WAR_HAMMER,  16, 16);
		assignItemRect(GLAIVE,      16, 16);
		assignItemRect(GREATAXE,    12, 16);
		assignItemRect(GREATSHIELD, 12, 16);
		assignItemRect(GAUNTLETS,   13, 15);
	}

	private static final int HANDGUNS         =                               xy(1, 32);
	public static final int CRUDE_PISTOL  = HANDGUNS+0;
	public static final int PISTOL		  = HANDGUNS+1;
	public static final int GOLDEN_PISTOL = HANDGUNS+2;
	public static final int HANDGUN       = HANDGUNS+3;
	public static final int MAGNUM        = HANDGUNS+4;
	public static final int AUTOHANDGUN   = HANDGUNS+5;
	static{
		assignItemRect(CRUDE_PISTOL   ,10, 13);
		assignItemRect(PISTOL		  ,11, 15);
		assignItemRect(GOLDEN_PISTOL  ,13, 15);
		assignItemRect(HANDGUN        ,13, 16);
		assignItemRect(MAGNUM         ,12, 16);
		assignItemRect(AUTOHANDGUN    ,12, 15);
	}

	private static final int SNIPERS         =                               xy(9, 32);
	public static final int HUNTING_RIFLE = SNIPERS+0;
	public static final int SNIPER_RIFLE  = SNIPERS+1;
	public static final int MARKSMAN      = SNIPERS+2;
	public static final int SNIPERS_4     = SNIPERS+3;
	public static final int SNIPERS_5     = SNIPERS+4;
	public static final int SNIPERS_6     = SNIPERS+5;
	static{
		assignItemRect(HUNTING_RIFLE  ,13, 16);
		assignItemRect(SNIPER_RIFLE   ,14, 16);
		assignItemRect(MARKSMAN       ,15, 16);
		assignItemRect(SNIPERS_4      ,16, 16);
		assignItemRect(SNIPERS_5      ,16, 16);
		assignItemRect(SNIPERS_6      ,16, 16);
	}

	private static final int MACHINEGUNS         =                               xy(1, 33);
	public static final int DUAL_PISTOL        = MACHINEGUNS+0;
	public static final int SUBMACHINEGUN     = MACHINEGUNS+1;
	public static final int ASSULT_RIFLE      = MACHINEGUNS+2;
	public static final int HEAVY_MACHINEGUN  = MACHINEGUNS+3;
	public static final int AUTO_RIFLE        = MACHINEGUNS+4;
	public static final int MACHINEGUNS_6     = MACHINEGUNS+5;
	static{
		assignItemRect(DUAL_PISTOL        ,15, 16);
		assignItemRect(SUBMACHINEGUN     ,15, 15);
		assignItemRect(ASSULT_RIFLE      ,15, 16);
		assignItemRect(HEAVY_MACHINEGUN  ,13, 15);
		assignItemRect(AUTO_RIFLE	     ,15, 16);
		assignItemRect(MACHINEGUNS_6     ,16, 16);
	}

	private static final int SPECIALGUNS         =                               xy(9, 33);
	public static final int SHOTGUN          = SPECIALGUNS+0;
	public static final int ROCKET_LAUNCHER  = SPECIALGUNS+1;
	public static final int SPECIALGUNS_3    = SPECIALGUNS+2;
	public static final int FLAMETHORWER     = SPECIALGUNS+3;
	public static final int PLASMA_CANNON    = SPECIALGUNS+4;
	public static final int SPAS             = SPECIALGUNS+5;

	static{
		assignItemRect(SHOTGUN              ,14, 16);
		assignItemRect(ROCKET_LAUNCHER      ,15, 15);
		assignItemRect(SPECIALGUNS_3        ,16, 16);
		assignItemRect(FLAMETHORWER         ,14, 15);
		assignItemRect(PLASMA_CANNON        ,14, 16);
		assignItemRect(SPAS                 ,15, 16);
	}

	private static final int ALCHEMYGUNS         =                               xy(1, 34);
	public static final int MINIGUN         = ALCHEMYGUNS+0;
	public static final int LARGEHANDGUN    = ALCHEMYGUNS+1;
	public static final int ANTIMATER_RIFLE = ALCHEMYGUNS+2;
	public static final int RPG7            = ALCHEMYGUNS+3;
	public static final int ALCHEMYGUNS_5   = ALCHEMYGUNS+4;
	public static final int ALCHEMYGUNS_6   = ALCHEMYGUNS+5;
	static{
		assignItemRect(MINIGUN            ,16, 15);
		assignItemRect(LARGEHANDGUN       ,16, 16);
		assignItemRect(ANTIMATER_RIFLE    ,15, 16);
		assignItemRect(RPG7               ,16, 16);
		assignItemRect(ALCHEMYGUNS_5      ,16, 16);
		assignItemRect(ALCHEMYGUNS_6      ,16, 16);
	}

	private static final int ETC            =                               xy(9, 34);
	public static final int MISSILE_BUTTON  = ETC+0;
	public static final int WIND_BOW    	= ETC+1;
	public static final int NATURAL_BOW   	= ETC+2;
	public static final int GOLDEN_BOW    	= ETC+3;
	public static final int POISON_BOW    	= ETC+4;
	static{
		assignItemRect(MISSILE_BUTTON      ,14, 14);
		assignItemRect(WIND_BOW            ,16, 16);
		assignItemRect(NATURAL_BOW         ,16, 16);
		assignItemRect(GOLDEN_BOW          ,16, 16);
		assignItemRect(POISON_BOW          ,16, 16);
	}

	private static final int SUBWEAPONS         =                               xy(1, 35);
	public static final int GRENADE_LAUNCHER 	= SUBWEAPONS+0;
	public static final int SMOKE_LAUNCHER   	= SUBWEAPONS+1;
	public static final int HE_LAUNCHER    	 	= SUBWEAPONS+2;
	public static final int SLEEP_GUN 			= SUBWEAPONS+3;
	public static final int FROST_GUN 			= SUBWEAPONS+4;
	public static final int PARALYSIS_GUN 		= SUBWEAPONS+5;
	static{
		assignItemRect(GRENADE_LAUNCHER ,15, 15);
		assignItemRect(SMOKE_LAUNCHER   ,15, 15);
		assignItemRect(HE_LAUNCHER    	,15, 15);
		assignItemRect(SLEEP_GUN 	   	,12, 15);
		assignItemRect(FROST_GUN 	   	,12, 15);
		assignItemRect(PARALYSIS_GUN   	,12, 15);
	}

	private static final int KATANAS         =                               xy(1, 36);
	public static final int WORN_KATANA     = KATANAS+0;
	public static final int SHORT_KATANA    = KATANAS+1;
	public static final int KATANA          = KATANAS+2;
	public static final int LONG_KATANA     = KATANAS+3;
	public static final int LARGE_KATANA    = KATANAS+4;

	static{
		assignItemRect(WORN_KATANA,    	13, 13);
		assignItemRect(SHORT_KATANA,    14, 14);
		assignItemRect(KATANA,          14, 15);
		assignItemRect(LONG_KATANA,     15, 16);
		assignItemRect(LARGE_KATANA,	12, 16);
	}

	private static final int ALCHEMYWEAPONS 	        =            	           xy(1, 37);
	public static final int SPEAR_N_SHIELD  	= ALCHEMYWEAPONS+0;
	public static final int LANCE_N_SHIELD  	= ALCHEMYWEAPONS+1;
	public static final int	CHAIN_FLAIL			= ALCHEMYWEAPONS+2;
	public static final int FLAME_SCIMITAR		= ALCHEMYWEAPONS+3;
	public static final int FROST_SCIMITAR		= ALCHEMYWEAPONS+4;
	public static final int POISON_SCIMITAR		= ALCHEMYWEAPONS+5;
	public static final int ELECTRO_SCIMITAR	= ALCHEMYWEAPONS+6;
	public static final int CURSED_SWORD		= ALCHEMYWEAPONS+7;
	public static final int UNHOLY_BIBLE    	= ALCHEMYWEAPONS+8;
	public static final int TACTICAL_SHIELD 	= ALCHEMYWEAPONS+9;
	public static final int BALLISTA  			= ALCHEMYWEAPONS+10;
	public static final int FORCE_GLOVE  		= ALCHEMYWEAPONS+11;
	public static final int HOLY_SWORD  		= ALCHEMYWEAPONS+12;
	public static final int CROSS  				= ALCHEMYWEAPONS+13;

	static{
		assignItemRect(SPEAR_N_SHIELD,  	16, 15);
		assignItemRect(LANCE_N_SHIELD,   	16, 15);
		assignItemRect(CHAIN_FLAIL,   		16, 16);
		assignItemRect(FLAME_SCIMITAR,   	13, 16);
		assignItemRect(FROST_SCIMITAR,   	13, 16);
		assignItemRect(POISON_SCIMITAR,   	13, 16);
		assignItemRect(ELECTRO_SCIMITAR,   	13, 16);
		assignItemRect(CURSED_SWORD,   		14, 14);
		assignItemRect(UNHOLY_BIBLE, 	  	13, 16);
		assignItemRect(TACTICAL_SHIELD, 	12, 16);
		assignItemRect(BALLISTA, 	  		16, 16);
		assignItemRect(FORCE_GLOVE, 	  	13, 15);
		assignItemRect(HOLY_SWORD, 	  		16, 16);
		assignItemRect(CROSS, 	  			14, 14);
	}

	private static final int SPELLBOOKS 	        =            	           xy(1, 38);
	public static final int EMPTY_SPELLBOOK  		= SPELLBOOKS+0;
	public static final int FIRE_SPELLBOOK  		= SPELLBOOKS+1;
	public static final int FROST_SPELLBOOK  		= SPELLBOOKS+2;
	public static final int LIGHTNING_SPELLBOOK 	= SPELLBOOKS+3;
	public static final int DISTRIBUTION_SPELLBOOK  = SPELLBOOKS+4;
	public static final int PRISMATIC_SPELLBOOK  	= SPELLBOOKS+5;
	public static final int CORROSION_SPELLBOOK  	= SPELLBOOKS+6;
	public static final int EARTH_SPELLBOOK  		= SPELLBOOKS+7;
	public static final int BLAST_SPELLBOOK  		= SPELLBOOKS+8;
	public static final int CORRUPTION_SPELLBOOK  	= SPELLBOOKS+9;
	public static final int WARDING_SPELLBOOK  		= SPELLBOOKS+10;
	public static final int REGROWTH_SPELLBOOK  	= SPELLBOOKS+11;
	public static final int TRANSFUSION_SPELLBOOK  	= SPELLBOOKS+12;
	static{
		for (int i = SPELLBOOKS; i < SPELLBOOKS+16; i++)
			assignItemRect(i, 12, 16);
	}

	private static final int ADVANCED_TIER5 = 								xy(1, 39);
	public static final int SPADE           = ADVANCED_TIER5+0;
	public static final int EXCROSSBOW      = ADVANCED_TIER5+1;
	public static final int TRUE_RUNIC_BLADE= ADVANCED_TIER5+2;
	public static final int CHAIN_WHIP		= ADVANCED_TIER5+3;
	public static final int MINERS_TOOL		= ADVANCED_TIER5+4;

	static{
		assignItemRect(SPADE,           	16, 16);
		assignItemRect(EXCROSSBOW,  		15, 16);
		assignItemRect(TRUE_RUNIC_BLADE,	14, 14);
		assignItemRect(CHAIN_WHIP,			14, 14);
		assignItemRect(CHAIN_WHIP,			16, 16);
	}

	private static final int ADVANCED_TIER6 = 								xy(1, 40);
	public static final int HUGE_SWORD      = ADVANCED_TIER6+0;
	public static final int IRON_HAMMER     = ADVANCED_TIER6+1;
	public static final int BEAM_SABER      = ADVANCED_TIER6+2;
	public static final int LANCE           = ADVANCED_TIER6+3;
	public static final int OBSIDIAN_SHIELD	= ADVANCED_TIER6+4;
	public static final int SHARP_KATANA    = ADVANCED_TIER6+5;
	public static final int ASSASSINS_SPEAR = ADVANCED_TIER6+6;

	static{
		assignItemRect(HUGE_SWORD,       	 16, 16);
		assignItemRect(IRON_HAMMER,      	 16, 16);
		assignItemRect(BEAM_SABER,       	 15, 15);
		assignItemRect(LANCE,            	 15, 15);
		assignItemRect(OBSIDIAN_SHIELD,  	 12, 16);
		assignItemRect(SHARP_KATANA,     	 12, 16);
		assignItemRect(ASSASSINS_SPEAR,      16, 16);
	}

	private static final int MISSILE_WEP    =                               xy(1, 10);  //16 slots. 3 per tier + boomerang
	public static final int SPIRIT_BOW      = MISSILE_WEP+0;
	
	public static final int DART            = MISSILE_WEP+1;
	public static final int THROWING_KNIFE  = MISSILE_WEP+2;
	public static final int THROWING_STONE  = MISSILE_WEP+3;
	
	public static final int FISHING_SPEAR   = MISSILE_WEP+4;
	public static final int SHURIKEN        = MISSILE_WEP+5;
	public static final int THROWING_CLUB   = MISSILE_WEP+6;
	public static final int THROWING_SPEAR  = MISSILE_WEP+7;
	public static final int BOLAS           = MISSILE_WEP+8;
	public static final int KUNAI           = MISSILE_WEP+9;
	
	public static final int JAVELIN         = MISSILE_WEP+10;
	public static final int TOMAHAWK        = MISSILE_WEP+11;
	public static final int BOOMERANG       = MISSILE_WEP+12;
	
	public static final int TRIDENT         = MISSILE_WEP+13;
	public static final int THROWING_HAMMER = MISSILE_WEP+14;
	public static final int FORCE_CUBE      = MISSILE_WEP+15;
	
	static{
		assignItemRect(SPIRIT_BOW,      16, 16);
		
		assignItemRect(DART,            15, 15);
		assignItemRect(THROWING_KNIFE,  12, 13);
		assignItemRect(THROWING_STONE,  12, 10);
		
		assignItemRect(FISHING_SPEAR,   11, 11);
		assignItemRect(SHURIKEN,        12, 12);
		assignItemRect(THROWING_CLUB,   12, 12);
		
		assignItemRect(THROWING_SPEAR,  13, 13);
		assignItemRect(BOLAS,           15, 14);
		assignItemRect(KUNAI,           15, 15);
		
		assignItemRect(JAVELIN,         16, 16);
		assignItemRect(TOMAHAWK,        13, 13);
		assignItemRect(BOOMERANG,       14, 14);
		
		assignItemRect(TRIDENT,         16, 16);
		assignItemRect(THROWING_HAMMER, 12, 12);
		assignItemRect(FORCE_CUBE,      11, 12);
	}
	
	public static final int TIPPED_DARTS    =                               xy(1, 11);  //16 slots
	public static final int ROT_DART        = TIPPED_DARTS+0;
	public static final int INCENDIARY_DART = TIPPED_DARTS+1;
	public static final int ADRENALINE_DART = TIPPED_DARTS+2;
	public static final int HEALING_DART    = TIPPED_DARTS+3;
	public static final int CHILLING_DART   = TIPPED_DARTS+4;
	public static final int SHOCKING_DART   = TIPPED_DARTS+5;
	public static final int POISON_DART     = TIPPED_DARTS+6;
	public static final int CLEANSING_DART  = TIPPED_DARTS+7;
	public static final int PARALYTIC_DART  = TIPPED_DARTS+8;
	public static final int HOLY_DART       = TIPPED_DARTS+9;
	public static final int DISPLACING_DART = TIPPED_DARTS+10;
	public static final int BLINDING_DART   = TIPPED_DARTS+11;
	static {
		for (int i = TIPPED_DARTS; i < TIPPED_DARTS+16; i++)
			assignItemRect(i, 15, 15);
	}
	
	private static final int ARMOR          =                               xy(1, 12);  //16 slots
	public static final int ARMOR_CLOTH     = ARMOR+0;
	public static final int ARMOR_LEATHER   = ARMOR+1;
	public static final int ARMOR_MAIL      = ARMOR+2;
	public static final int ARMOR_SCALE     = ARMOR+3;
	public static final int ARMOR_PLATE     = ARMOR+4;
	public static final int ARMOR_WARRIOR   = ARMOR+5;
	public static final int ARMOR_MAGE      = ARMOR+6;
	public static final int ARMOR_ROGUE     = ARMOR+7;
	public static final int ARMOR_HUNTRESS  = ARMOR+8;
	public static final int ARMOR_GUNNER    = ARMOR+9;
	public static final int ARMOR_SAMURAI   = ARMOR+10;
	public static final int ARMOR_PLANTER   = ARMOR+11;
	public static final int ARMOR_KNIGHT  	= ARMOR+12;
	public static final int ARMOR_NURSE  	= ARMOR+13;

	static{
		assignItemRect(ARMOR_CLOTH,   		15, 12);
		assignItemRect(ARMOR_LEATHER, 		14, 13);
		assignItemRect(ARMOR_MAIL,    		14, 12);
		assignItemRect(ARMOR_SCALE,   		14, 11);
		assignItemRect(ARMOR_PLATE,   		12, 12);
		assignItemRect(ARMOR_WARRIOR, 		12, 12);
		assignItemRect(ARMOR_MAGE,    		15, 15);
		assignItemRect(ARMOR_ROGUE,   		14, 12);
		assignItemRect(ARMOR_HUNTRESS,		13, 15);
		assignItemRect(ARMOR_GUNNER,  		15, 13);
		assignItemRect(ARMOR_SAMURAI, 		12, 16);
		assignItemRect(ARMOR_PLANTER, 		15, 12);
		assignItemRect(ARMOR_KNIGHT,  		14, 12);
		assignItemRect(ARMOR_NURSE,  		14, 12);
	}

	                                                                                    //16 free slots

	private static final int WANDS              =                           xy(1, 14);  //16 slots
	public static final int WAND_MAGIC_MISSILE  = WANDS+0;
	public static final int WAND_FIREBOLT       = WANDS+1;
	public static final int WAND_FROST          = WANDS+2;
	public static final int WAND_LIGHTNING      = WANDS+3;
	public static final int WAND_DISINTEGRATION = WANDS+4;
	public static final int WAND_PRISMATIC_LIGHT= WANDS+5;
	public static final int WAND_CORROSION      = WANDS+6;
	public static final int WAND_LIVING_EARTH   = WANDS+7;
	public static final int WAND_BLAST_WAVE     = WANDS+8;
	public static final int WAND_CORRUPTION     = WANDS+9;
	public static final int WAND_WARDING        = WANDS+10;
	public static final int WAND_REGROWTH       = WANDS+11;
	public static final int WAND_TRANSFUSION    = WANDS+12;
	static {
		for (int i = WANDS; i < WANDS+16; i++)
			assignItemRect(i, 14, 14);
	}

	private static final int RINGS          =                               xy(1, 15);  //16 slots
	public static final int RING_GARNET     = RINGS+0;
	public static final int RING_RUBY       = RINGS+1;
	public static final int RING_TOPAZ      = RINGS+2;
	public static final int RING_EMERALD    = RINGS+3;
	public static final int RING_ONYX       = RINGS+4;
	public static final int RING_OPAL       = RINGS+5;
	public static final int RING_TOURMALINE = RINGS+6;
	public static final int RING_SAPPHIRE   = RINGS+7;
	public static final int RING_AMETHYST   = RINGS+8;
	public static final int RING_QUARTZ     = RINGS+9;
	public static final int RING_AGATE      = RINGS+10;
	public static final int RING_DIAMOND    = RINGS+11;
	public static final int RING_OBSIDIAN   = RINGS+12;
	public static final int RING_PEARL   = RINGS+13;
	static {
		for (int i = RINGS; i < RINGS+16; i++)
			assignItemRect(i, 8, 10);
	}

	private static final int ARTIFACTS          =                            xy(1, 16);  //32 slots
	public static final int ARTIFACT_CLOAK      = ARTIFACTS+0;
	public static final int ARTIFACT_ARMBAND    = ARTIFACTS+1;
	public static final int ARTIFACT_CAPE       = ARTIFACTS+2;
	public static final int ARTIFACT_TALISMAN   = ARTIFACTS+3;
	public static final int ARTIFACT_HOURGLASS  = ARTIFACTS+4;
	public static final int ARTIFACT_TOOLKIT    = ARTIFACTS+5;
	public static final int ARTIFACT_SPELLBOOK  = ARTIFACTS+6;
	public static final int ARTIFACT_BEACON     = ARTIFACTS+7;
	public static final int ARTIFACT_CHAINS     = ARTIFACTS+8;
	public static final int ARTIFACT_HORN1      = ARTIFACTS+9;
	public static final int ARTIFACT_HORN2      = ARTIFACTS+10;
	public static final int ARTIFACT_HORN3      = ARTIFACTS+11;
	public static final int ARTIFACT_HORN4      = ARTIFACTS+12;
	public static final int ARTIFACT_CHALICE1   = ARTIFACTS+13;
	public static final int ARTIFACT_CHALICE2   = ARTIFACTS+14;
	public static final int ARTIFACT_CHALICE3   = ARTIFACTS+15;
	public static final int ARTIFACT_SANDALS    = ARTIFACTS+16;
	public static final int ARTIFACT_SHOES      = ARTIFACTS+17;
	public static final int ARTIFACT_BOOTS      = ARTIFACTS+18;
	public static final int ARTIFACT_GREAVES    = ARTIFACTS+19;
	public static final int ARTIFACT_ROSE1      = ARTIFACTS+20;
	public static final int ARTIFACT_ROSE2      = ARTIFACTS+21;
	public static final int ARTIFACT_ROSE3      = ARTIFACTS+22;
	static{
		assignItemRect(ARTIFACT_CLOAK,      9,  15);
		assignItemRect(ARTIFACT_ARMBAND,    16, 13);
		assignItemRect(ARTIFACT_CAPE,       16, 14);
		assignItemRect(ARTIFACT_TALISMAN,   15, 13);
		assignItemRect(ARTIFACT_HOURGLASS,  13, 16);
		assignItemRect(ARTIFACT_TOOLKIT,    15, 13);
		assignItemRect(ARTIFACT_SPELLBOOK,  13, 16);
		assignItemRect(ARTIFACT_BEACON,     16, 16);
		assignItemRect(ARTIFACT_CHAINS,     16, 16);
		assignItemRect(ARTIFACT_HORN1,      15, 15);
		assignItemRect(ARTIFACT_HORN2,      15, 15);
		assignItemRect(ARTIFACT_HORN3,      15, 15);
		assignItemRect(ARTIFACT_HORN4,      15, 15);
		assignItemRect(ARTIFACT_CHALICE1,   12, 15);
		assignItemRect(ARTIFACT_CHALICE2,   12, 15);
		assignItemRect(ARTIFACT_CHALICE3,   12, 15);
		assignItemRect(ARTIFACT_SANDALS,    16, 6 );
		assignItemRect(ARTIFACT_SHOES,      16, 6 );
		assignItemRect(ARTIFACT_BOOTS,      16, 9 );
		assignItemRect(ARTIFACT_GREAVES,    16, 14);
		assignItemRect(ARTIFACT_ROSE1,      14, 14);
		assignItemRect(ARTIFACT_ROSE2,      14, 14);
		assignItemRect(ARTIFACT_ROSE3,      14, 14);
	}

	                                                                                    //16 free slots

	private static final int SCROLLS        =                               xy(1, 19);  //16 slots
	public static final int SCROLL_KAUNAN   = SCROLLS+0;
	public static final int SCROLL_SOWILO   = SCROLLS+1;
	public static final int SCROLL_LAGUZ    = SCROLLS+2;
	public static final int SCROLL_YNGVI    = SCROLLS+3;
	public static final int SCROLL_GYFU     = SCROLLS+4;
	public static final int SCROLL_RAIDO    = SCROLLS+5;
	public static final int SCROLL_ISAZ     = SCROLLS+6;
	public static final int SCROLL_MANNAZ   = SCROLLS+7;
	public static final int SCROLL_NAUDIZ   = SCROLLS+8;
	public static final int SCROLL_BERKANAN = SCROLLS+9;
	public static final int SCROLL_ODAL     = SCROLLS+10;
	public static final int SCROLL_TIWAZ    = SCROLLS+11;
	public static final int SCROLL_PLUS   	= SCROLLS+12;
	public static final int SCROLL_CATALYST = SCROLLS+13;
	public static final int ARCANE_RESIN    = SCROLLS+14;
	static {
		for (int i = SCROLLS; i < SCROLLS+16; i++)
			assignItemRect(i, 15, 14);
		assignItemRect(SCROLL_PLUS,		15, 14);
		assignItemRect(SCROLL_CATALYST, 12, 11);
		assignItemRect(ARCANE_RESIN   , 12, 11);
	}
	
	private static final int EXOTIC_SCROLLS =                               xy(1, 20);  //16 slots
	public static final int EXOTIC_KAUNAN   = EXOTIC_SCROLLS+0;
	public static final int EXOTIC_SOWILO   = EXOTIC_SCROLLS+1;
	public static final int EXOTIC_LAGUZ    = EXOTIC_SCROLLS+2;
	public static final int EXOTIC_YNGVI    = EXOTIC_SCROLLS+3;
	public static final int EXOTIC_GYFU     = EXOTIC_SCROLLS+4;
	public static final int EXOTIC_RAIDO    = EXOTIC_SCROLLS+5;
	public static final int EXOTIC_ISAZ     = EXOTIC_SCROLLS+6;
	public static final int EXOTIC_MANNAZ   = EXOTIC_SCROLLS+7;
	public static final int EXOTIC_NAUDIZ   = EXOTIC_SCROLLS+8;
	public static final int EXOTIC_BERKANAN = EXOTIC_SCROLLS+9;
	public static final int EXOTIC_ODAL     = EXOTIC_SCROLLS+10;
	public static final int EXOTIC_TIWAZ    = EXOTIC_SCROLLS+11;
	public static final int EXOTIC_PLUS     = EXOTIC_SCROLLS+12;
	static {
		for (int i = EXOTIC_SCROLLS; i < EXOTIC_SCROLLS+16; i++)
			assignItemRect(i, 15, 14);
	}
	
	private static final int STONES             =                           xy(1, 21);  //16 slots
	public static final int STONE_AGGRESSION    = STONES+0;
	public static final int STONE_AUGMENTATION  = STONES+1;
	public static final int STONE_FEAR          = STONES+2;
	public static final int STONE_BLAST         = STONES+3;
	public static final int STONE_BLINK         = STONES+4;
	public static final int STONE_CLAIRVOYANCE  = STONES+5;
	public static final int STONE_SLEEP         = STONES+6;
	public static final int STONE_DISARM        = STONES+7;
	public static final int STONE_ENCHANT       = STONES+8;
	public static final int STONE_FLOCK         = STONES+9;
	public static final int STONE_INTUITION     = STONES+10;
	public static final int STONE_SHOCK         = STONES+11;
	static {
		for (int i = STONES; i < STONES+16; i++)
			assignItemRect(i, 14, 12);
	}

	private static final int POTIONS        =                               xy(1, 22);  //16 slots
	public static final int POTION_CRIMSON  = POTIONS+0;
	public static final int POTION_AMBER    = POTIONS+1;
	public static final int POTION_GOLDEN   = POTIONS+2;
	public static final int POTION_JADE     = POTIONS+3;
	public static final int POTION_TURQUOISE= POTIONS+4;
	public static final int POTION_AZURE    = POTIONS+5;
	public static final int POTION_INDIGO   = POTIONS+6;
	public static final int POTION_MAGENTA  = POTIONS+7;
	public static final int POTION_BISTRE   = POTIONS+8;
	public static final int POTION_CHARCOAL = POTIONS+9;
	public static final int POTION_SILVER   = POTIONS+10;
	public static final int POTION_IVORY    = POTIONS+11;
	public static final int POTION_CATALYST = POTIONS+13;
	public static final int LIQUID_METAL    = POTIONS+14;
	static {
		for (int i = POTIONS; i < POTIONS+16; i++)
			assignItemRect(i, 12, 14);
		assignItemRect(POTION_CATALYST, 6, 15);
		assignItemRect(LIQUID_METAL,    8, 15);
	}

	private static final int NEW_POTIONS = 								xy(1, 41);  //16 slots
	public static final int POTION_FLUORESCENT      = NEW_POTIONS+0;
	public static final int POTION_ASH     	 		= NEW_POTIONS+1;

	static{
		for (int i = NEW_POTIONS; i < NEW_POTIONS+16; i++)
			assignItemRect(i, 12, 14);
	}
	
	private static final int EXOTIC_POTIONS =                               xy(1, 23);  //16 slots
	public static final int EXOTIC_CRIMSON  = EXOTIC_POTIONS+0;
	public static final int EXOTIC_AMBER    = EXOTIC_POTIONS+1;
	public static final int EXOTIC_GOLDEN   = EXOTIC_POTIONS+2;
	public static final int EXOTIC_JADE     = EXOTIC_POTIONS+3;
	public static final int EXOTIC_TURQUOISE= EXOTIC_POTIONS+4;
	public static final int EXOTIC_AZURE    = EXOTIC_POTIONS+5;
	public static final int EXOTIC_INDIGO   = EXOTIC_POTIONS+6;
	public static final int EXOTIC_MAGENTA  = EXOTIC_POTIONS+7;
	public static final int EXOTIC_BISTRE   = EXOTIC_POTIONS+8;
	public static final int EXOTIC_CHARCOAL = EXOTIC_POTIONS+9;
	public static final int EXOTIC_SILVER   = EXOTIC_POTIONS+10;
	public static final int EXOTIC_IVORY    = EXOTIC_POTIONS+11;
	static {
		for (int i = EXOTIC_POTIONS; i < EXOTIC_POTIONS+16; i++)
			assignItemRect(i, 12, 13);
	}

	private static final int NEW_EXOTIC_POTIONS = 						xy(1, 42);  //16 slots
	public static final int EXOTIC_FLUORESCENT      = NEW_EXOTIC_POTIONS+0;
	public static final int EXOTIC_ASH     			= NEW_EXOTIC_POTIONS+1;

	static{
		for (int i = NEW_EXOTIC_POTIONS; i < NEW_EXOTIC_POTIONS+16; i++)
			assignItemRect(i, 12, 14);
	}

	private static final int SEEDS              =                           xy(1, 24);  //16 slots
	public static final int SEED_ROTBERRY       = SEEDS+0;
	public static final int SEED_FIREBLOOM      = SEEDS+1;
	public static final int SEED_SWIFTTHISTLE   = SEEDS+2;
	public static final int SEED_SUNGRASS       = SEEDS+3;
	public static final int SEED_ICECAP         = SEEDS+4;
	public static final int SEED_STORMVINE      = SEEDS+5;
	public static final int SEED_SORROWMOSS     = SEEDS+6;
	public static final int SEED_DREAMFOIL      = SEEDS+7;
	public static final int SEED_EARTHROOT      = SEEDS+8;
	public static final int SEED_STARFLOWER     = SEEDS+9;
	public static final int SEED_FADELEAF       = SEEDS+10;
	public static final int SEED_BLINDWEED      = SEEDS+11;
	static{
		for (int i = SEEDS; i < SEEDS+16; i++)
			assignItemRect(i, 10, 10);
	}
	
	private static final int BREWS          =                               xy(1, 25);  //8 slots
	public static final int BREW_INFERNAL   = BREWS+0;
	public static final int BREW_BLIZZARD   = BREWS+1;
	public static final int BREW_SHOCKING   = BREWS+2;
	public static final int BREW_CAUSTIC    = BREWS+3;
	
	private static final int ELIXIRS        =                               xy(9, 25);  //8 slots
	public static final int ELIXIR_HONEY    = ELIXIRS+0;
	public static final int ELIXIR_AQUA     = ELIXIRS+1;
	public static final int ELIXIR_MIGHT    = ELIXIRS+2;
	public static final int ELIXIR_DRAGON   = ELIXIRS+3;
	public static final int ELIXIR_TOXIC    = ELIXIRS+4;
	public static final int ELIXIR_ICY      = ELIXIRS+5;
	public static final int ELIXIR_ARCANE   = ELIXIRS+6;
	public static final int ELIXIR_TALENT   = ELIXIRS+7;
	static{
		for (int i = BREWS; i < BREWS+16; i++)
			assignItemRect(i, 12, 14);
	}

	private static final int NEW_ELIXIRS = 								xy(1, 43);  //16 slots
	public static final int ELIXIR_HEALTH      = NEW_ELIXIRS+0;

	static{
		for (int i = NEW_ELIXIRS; i < NEW_ELIXIRS+16; i++)
			assignItemRect(i, 12, 14);
	}

	private static final int SPELLS_2         =                               xy(1, 26);  //16 slots
	public static final int FIREIMBUE_SPELL    = SPELLS_2+0;
	public static final int XRAY			   = SPELLS_2+1;
	static{
		assignItemRect(FIREIMBUE_SPELL,    12, 11);
		assignItemRect(XRAY,		       12, 11);
	}
	
	private static final int SPELLS         =                               xy(1, 27);  //16 slots
	public static final int MAGIC_PORTER    = SPELLS+0;
	public static final int PHASE_SHIFT     = SPELLS+1;
	public static final int TELE_GRAB       = SPELLS+2;
	public static final int WILD_ENERGY     = SPELLS+3;
	public static final int RETURN_BEACON   = SPELLS+4;
	public static final int SUMMON_ELE      = SPELLS+5;
	public static final int HANDY_BARRICADE = SPELLS+6;
	public static final int AQUA_BLAST      = SPELLS+7;
	public static final int FEATHER_FALL    = SPELLS+8;
	public static final int RECLAIM_TRAP    = SPELLS+9;
	public static final int AD_EVOLUTION	= SPELLS+10;
	public static final int CURSE_INFUSE    = SPELLS+11;
	public static final int MAGIC_INFUSE    = SPELLS+12;
	public static final int ALCHEMIZE       = SPELLS+13;
	public static final int RECYCLE         = SPELLS+14;
	public static final int EVOLUTION		= SPELLS+15;
	static{
		assignItemRect(MAGIC_PORTER,    12, 11);
		assignItemRect(PHASE_SHIFT,     12, 11);
		assignItemRect(TELE_GRAB,       12, 11);
		assignItemRect(WILD_ENERGY,      8, 16);
		assignItemRect(RETURN_BEACON,    8, 16);
		assignItemRect(SUMMON_ELE,       8, 16);
		assignItemRect(HANDY_BARRICADE,  8, 16);
		assignItemRect(AQUA_BLAST,      11, 11);
		assignItemRect(FEATHER_FALL,    11, 11);
		assignItemRect(RECLAIM_TRAP,    11, 11);
		assignItemRect(AD_EVOLUTION,    10, 15);
		assignItemRect(CURSE_INFUSE,    10, 15);
		assignItemRect(MAGIC_INFUSE,    10, 15);
		assignItemRect(ALCHEMIZE,       10, 15);
		assignItemRect(RECYCLE,         10, 15);
		assignItemRect(EVOLUTION,       10, 15);
	}
	
	private static final int FOOD       =                                   xy(1, 28);  //16 slots
	public static final int MEAT        = FOOD+0;
	public static final int STEAK       = FOOD+1;
	public static final int STEWED      = FOOD+2;
	public static final int OVERPRICED  = FOOD+3;
	public static final int CARPACCIO   = FOOD+4;
	public static final int RATION      = FOOD+5;
	public static final int PASTY       = FOOD+6;
	public static final int PUMPKIN_PIE = FOOD+7;
	public static final int CANDY_CANE  = FOOD+8;
	public static final int MEAT_PIE    = FOOD+9;
	public static final int BLANDFRUIT  = FOOD+10;
	public static final int BLAND_CHUNKS= FOOD+11;
	public static final int BERRY =       FOOD+12;
	static{
		assignItemRect(MEAT,        15, 11);
		assignItemRect(STEAK,       15, 11);
		assignItemRect(STEWED,      15, 11);
		assignItemRect(OVERPRICED,  14, 11);
		assignItemRect(CARPACCIO,   15, 11);
		assignItemRect(RATION,      16, 12);
		assignItemRect(PASTY,       16, 11);
		assignItemRect(PUMPKIN_PIE, 16, 12);
		assignItemRect(CANDY_CANE,  13, 16);
		assignItemRect(MEAT_PIE,    16, 12);
		assignItemRect(BLANDFRUIT,  9,  12);
		assignItemRect(BLAND_CHUNKS,14, 6);
		assignItemRect(BERRY,       9,  11);
	}

	private static final int QUEST       =                                       xy(1, 29);  //32 slots
	public static final int SKULL        = QUEST+0;
	public static final int DUST         = QUEST+1;
	public static final int CANDLE       = QUEST+2;
	public static final int EMBER        = QUEST+3;
	public static final int PICKAXE      = QUEST+4;
	public static final int ORE          = QUEST+5;
	public static final int TOKEN        = QUEST+6;
	public static final int BLOB         = QUEST+7;
	public static final int SHARD        = QUEST+8;
	public static final int BRASS_SCRAP  = QUEST+9;
	public static final int CARTRIDGE    = QUEST+10;
	public static final int	AP_BULLET    = QUEST+11;
	public static final int HP_BULLET    = QUEST+12;
	public static final int SHEATH       = QUEST+13;
	static{
		assignItemRect(SKULL,       16, 11);
		assignItemRect(DUST,        12, 11);
		assignItemRect(CANDLE,      12, 12);
		assignItemRect(EMBER,       12, 11);
		assignItemRect(PICKAXE,     14, 14);
		assignItemRect(ORE,         15, 15);
		assignItemRect(TOKEN,       12, 12);
		assignItemRect(BLOB,        10,  9);
		assignItemRect(SHARD,       8,  10);
		assignItemRect(BRASS_SCRAP, 15, 11);
		assignItemRect(CARTRIDGE,	11, 11);
		assignItemRect(AP_BULLET,	13, 13);
		assignItemRect(HP_BULLET,	13, 13);
		assignItemRect(SHEATH,	    13, 13);
	}

	private static final int BULLETS      	=                                       xy(1, 30);  //16 slots
	public static final int SINGLE_BULLET 	= BULLETS+0;
	public static final int DUAL_BULLET   	= BULLETS+1;
	public static final int TRIPLE_BULLET 	= BULLETS+2;
	public static final int SNIPER_BULLET 	= BULLETS+3;
	public static final int ROCKET        	= BULLETS+4;
	public static final int ENERGY_BULLET_1 = BULLETS+5;
	public static final int ENERGY_BULLET_2 = BULLETS+6;
	public static final int ENERGY_BULLET_3 = BULLETS+7;
	public static final int WIND_ARROW		= BULLETS+8;
	public static final int NATURAL_ARROW	= BULLETS+9;
	public static final int GOLDEN_ARROW	= BULLETS+10;
	public static final int	POISON_ARROW	= BULLETS+11;
	public static final int GRENADE 		= BULLETS+12;
	public static final int HE_GRENADE 		= BULLETS+13;
	public static final int SMOKE_GRENADE 	= BULLETS+14;
	public static final int SPIRIT_BULLET 	= BULLETS+15;
	static{
		assignItemRect(SINGLE_BULLET,   8,  8 );
		assignItemRect(DUAL_BULLET,     11, 10);
		assignItemRect(TRIPLE_BULLET,   11, 11);
		assignItemRect(SNIPER_BULLET,   8,  8 );
		assignItemRect(ROCKET,          9,  9 );
		assignItemRect(ENERGY_BULLET_1, 10, 10);
		assignItemRect(ENERGY_BULLET_2, 12, 12);
		assignItemRect(ENERGY_BULLET_3, 12, 12);
		assignItemRect(WIND_ARROW,		11, 11);
		assignItemRect(NATURAL_ARROW,	11, 11);
		assignItemRect(GOLDEN_ARROW,	11, 11);
		assignItemRect(POISON_ARROW,	11, 11);
		assignItemRect(GRENADE,			7,  7 );
		assignItemRect(HE_GRENADE,		7,  7 );
		assignItemRect(SMOKE_GRENADE,	7,  7 );
		assignItemRect(SPIRIT_BULLET,	8,  8);
	}

	private static final int BAGS       =                                   xy(1, 31);  //16 slots
	public static final int WATERSKIN   = BAGS+0;
	public static final int BACKPACK    = BAGS+1;
	public static final int POUCH       = BAGS+2;
	public static final int HOLDER      = BAGS+3;
	public static final int BANDOLIER   = BAGS+4;
	public static final int HOLSTER     = BAGS+5;
	public static final int VIAL        = BAGS+6;
	static{
		assignItemRect(WATERSKIN,   16, 14);
		assignItemRect(BACKPACK,    16, 16);
		assignItemRect(POUCH,       14, 15);
		assignItemRect(HOLDER,      16, 16);
		assignItemRect(BANDOLIER,   15, 16);
		assignItemRect(HOLSTER,     15, 16);
		assignItemRect(VIAL,        12, 12);
	}

	                                                                                    //16 free slots

	//for smaller 8x8 icons that often accompany an item sprite
	public static class Icons {

		private static final int WIDTH = 16;
		public static final int SIZE = 8;

		public static TextureFilm film = new TextureFilm( Assets.Sprites.ITEM_ICONS, SIZE, SIZE );

		private static int xy(int x, int y){
			x -= 1; y -= 1;
			return x + WIDTH*y;
		}

		private static void assignIconRect( int item, int width, int height ){
			int x = (item % WIDTH) * SIZE;
			int y = (item / WIDTH) * SIZE;
			film.add( item, x, y, x+width, y+height);
		}

		private static final int RINGS          =                            xy(1, 1);  //16 slots
		public static final int RING_ACCURACY   = RINGS+0;
		public static final int RING_ELEMENTS   = RINGS+1;
		public static final int RING_ENERGY     = RINGS+2;
		public static final int RING_EVASION    = RINGS+3;
		public static final int RING_FORCE      = RINGS+4;
		public static final int RING_FUROR      = RINGS+5;
		public static final int RING_HASTE      = RINGS+6;
		public static final int RING_MIGHT      = RINGS+7;
		public static final int RING_SHARPSHOOT = RINGS+8;
		public static final int RING_TENACITY   = RINGS+9;
		public static final int RING_WEALTH     = RINGS+10;
		public static final int RING_RUSH    	= RINGS+11;
		static {
			assignIconRect( RING_ACCURACY,      7, 7 );
			assignIconRect( RING_ELEMENTS,      7, 7 );
			assignIconRect( RING_ENERGY,        7, 5 );
			assignIconRect( RING_EVASION,       7, 7 );
			assignIconRect( RING_FORCE,         5, 6 );
			assignIconRect( RING_FUROR,         7, 6 );
			assignIconRect( RING_HASTE,         6, 6 );
			assignIconRect( RING_MIGHT,         7, 7 );
			assignIconRect( RING_SHARPSHOOT,    7, 7 );
			assignIconRect( RING_TENACITY,      6, 6 );
			assignIconRect( RING_WEALTH,        7, 6 );
			assignIconRect( RING_RUSH,       	7, 6 );
		}

		                                                                                //16 free slots

		private static final int SCROLLS        =                            xy(1, 3);  //16 slots
		public static final int SCROLL_UPGRADE  = SCROLLS+0;
		public static final int SCROLL_IDENTIFY = SCROLLS+1;
		public static final int SCROLL_REMCURSE = SCROLLS+2;
		public static final int SCROLL_MIRRORIMG= SCROLLS+3;
		public static final int SCROLL_RECHARGE = SCROLLS+4;
		public static final int SCROLL_TELEPORT = SCROLLS+5;
		public static final int SCROLL_LULLABY  = SCROLLS+6;
		public static final int SCROLL_MAGICMAP = SCROLLS+7;
		public static final int SCROLL_RAGE     = SCROLLS+8;
		public static final int SCROLL_RETRIB   = SCROLLS+9;
		public static final int SCROLL_TERROR   = SCROLLS+10;
		public static final int SCROLL_TRANSMUTE= SCROLLS+11;
		static {
			assignIconRect( SCROLL_UPGRADE,     7, 7 );
			assignIconRect( SCROLL_IDENTIFY,    4, 7 );
			assignIconRect( SCROLL_REMCURSE,    7, 7 );
			assignIconRect( SCROLL_MIRRORIMG,   7, 5 );
			assignIconRect( SCROLL_RECHARGE,    7, 5 );
			assignIconRect( SCROLL_TELEPORT,    7, 7 );
			assignIconRect( SCROLL_LULLABY,     7, 6 );
			assignIconRect( SCROLL_MAGICMAP,    7, 7 );
			assignIconRect( SCROLL_RAGE,        6, 6 );
			assignIconRect( SCROLL_RETRIB,      5, 6 );
			assignIconRect( SCROLL_TERROR,      5, 7 );
			assignIconRect( SCROLL_TRANSMUTE,   7, 7 );
		}

		private static final int EXOTIC_SCROLLS =                            xy(1, 4);  //16 slots
		public static final int SCROLL_ENCHANT  = EXOTIC_SCROLLS+0;
		public static final int SCROLL_DIVINATE = EXOTIC_SCROLLS+1;
		public static final int SCROLL_ANTIMAGIC= EXOTIC_SCROLLS+2;
		public static final int SCROLL_PRISIMG  = EXOTIC_SCROLLS+3;
		public static final int SCROLL_MYSTENRG = EXOTIC_SCROLLS+4;
		public static final int SCROLL_PASSAGE  = EXOTIC_SCROLLS+5;
		public static final int SCROLL_SIREN    = EXOTIC_SCROLLS+6;
		public static final int SCROLL_FORESIGHT= EXOTIC_SCROLLS+7;
		public static final int SCROLL_CHALLENGE= EXOTIC_SCROLLS+8;
		public static final int SCROLL_PSIBLAST = EXOTIC_SCROLLS+9;
		public static final int SCROLL_DREAD    = EXOTIC_SCROLLS+10;
		public static final int SCROLL_METAMORPH= EXOTIC_SCROLLS+11;
		static {
			assignIconRect( SCROLL_ENCHANT,     7, 7 );
			assignIconRect( SCROLL_DIVINATE,    7, 6 );
			assignIconRect( SCROLL_ANTIMAGIC,   7, 7 );
			assignIconRect( SCROLL_PRISIMG,     5, 7 );
			assignIconRect( SCROLL_MYSTENRG,    7, 5 );
			assignIconRect( SCROLL_PASSAGE,     5, 7 );
			assignIconRect( SCROLL_SIREN,       7, 6 );
			assignIconRect( SCROLL_FORESIGHT,   7, 5 );
			assignIconRect( SCROLL_CHALLENGE,   7, 7 );
			assignIconRect( SCROLL_PSIBLAST,    5, 6 );
			assignIconRect( SCROLL_DREAD,       5, 7 );
			assignIconRect( SCROLL_METAMORPH,   7, 7 );
		}

		                                                                                //16 free slots

		private static final int POTIONS        =                            xy(1, 6);  //16 slots
		public static final int POTION_STRENGTH = POTIONS+0;
		public static final int POTION_HEALING  = POTIONS+1;
		public static final int POTION_MINDVIS  = POTIONS+2;
		public static final int POTION_FROST    = POTIONS+3;
		public static final int POTION_LIQFLAME = POTIONS+4;
		public static final int POTION_TOXICGAS = POTIONS+5;
		public static final int POTION_HASTE    = POTIONS+6;
		public static final int POTION_INVIS    = POTIONS+7;
		public static final int POTION_LEVITATE = POTIONS+8;
		public static final int POTION_PARAGAS  = POTIONS+9;
		public static final int POTION_PURITY   = POTIONS+10;
		public static final int POTION_EXP      = POTIONS+11;
		public static final int POTION_WEAPON   = POTIONS+12;
		public static final int POTION_ARMOR    = POTIONS+13;
		static {
			assignIconRect( POTION_STRENGTH,    7, 7 );
			assignIconRect( POTION_HEALING,     6, 7 );
			assignIconRect( POTION_MINDVIS,     7, 5 );
			assignIconRect( POTION_FROST,       7, 7 );
			assignIconRect( POTION_LIQFLAME,    5, 7 );
			assignIconRect( POTION_TOXICGAS,    7, 7 );
			assignIconRect( POTION_HASTE,       6, 6 );
			assignIconRect( POTION_INVIS,       5, 7 );
			assignIconRect( POTION_LEVITATE,    6, 7 );
			assignIconRect( POTION_PARAGAS,     7, 7 );
			assignIconRect( POTION_PURITY,      5, 7 );
			assignIconRect( POTION_EXP,         7, 7 );
			assignIconRect( POTION_WEAPON,      7, 6 );
			assignIconRect( POTION_ARMOR,       8, 7 );
		}

		private static final int EXOTIC_POTIONS =                            xy(1, 7);  //16 slots
		public static final int POTION_MASTERY  = EXOTIC_POTIONS+0;
		public static final int POTION_SHIELDING= EXOTIC_POTIONS+1;
		public static final int POTION_MAGISIGHT= EXOTIC_POTIONS+2;
		public static final int POTION_SNAPFREEZ= EXOTIC_POTIONS+3;
		public static final int POTION_DRGBREATH= EXOTIC_POTIONS+4;
		public static final int POTION_CORROGAS = EXOTIC_POTIONS+5;
		public static final int POTION_STAMINA  = EXOTIC_POTIONS+6;
		public static final int POTION_SHROUDFOG= EXOTIC_POTIONS+7;
		public static final int POTION_STRMCLOUD= EXOTIC_POTIONS+8;
		public static final int POTION_EARTHARMR= EXOTIC_POTIONS+9;
		public static final int POTION_CLEANSE  = EXOTIC_POTIONS+10;
		public static final int POTION_DIVINE   = EXOTIC_POTIONS+11;
		public static final int POTION_W_UPGRADE= EXOTIC_POTIONS+12;
		public static final int POTION_A_UPGRADE= EXOTIC_POTIONS+13;
		static {
			assignIconRect( POTION_MASTERY,     7, 7 );
			assignIconRect( POTION_SHIELDING,   6, 6 );
			assignIconRect( POTION_MAGISIGHT,   7, 5 );
			assignIconRect( POTION_SNAPFREEZ,   7, 7 );
			assignIconRect( POTION_DRGBREATH,   7, 7 );
			assignIconRect( POTION_CORROGAS,    7, 7 );
			assignIconRect( POTION_STAMINA,     6, 6 );
			assignIconRect( POTION_SHROUDFOG,   7, 7 );
			assignIconRect( POTION_STRMCLOUD,   7, 7 );
			assignIconRect( POTION_EARTHARMR,   6, 6 );
			assignIconRect( POTION_CLEANSE,     7, 7 );
			assignIconRect( POTION_DIVINE,      7, 7 );
			assignIconRect( POTION_W_UPGRADE,   7, 7 );
			assignIconRect( POTION_A_UPGRADE,   7, 7 );
		}

		                                                                                //16 free slots

	}

}
