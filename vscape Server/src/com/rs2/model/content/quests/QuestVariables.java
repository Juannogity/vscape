package com.rs2.model.content.quests;

import com.rs2.model.Position;
import com.rs2.model.content.quests.impl.ErnestTheChicken;
import com.rs2.model.content.quests.impl.TheGolem;
import com.rs2.model.players.Player;
import com.rs2.util.Misc;

import java.util.ArrayList;

public class QuestVariables {

	@SuppressWarnings("unused")
	private final Player player;

	public boolean waterfallOption1 = false;
	public boolean waterfallOption2 = false;
	public boolean waterfallOption3 = false;
	public boolean waterfallPillars[][] = {{false, false, false}, {false, false, false}, {false, false, false}, {false, false, false}, {false, false, false}, {false, false, false}};
	private boolean phoenixGang = false;
	private boolean blackArmGang = false;
	private boolean[] ernestLevers = new boolean[6];
	private boolean[] ernestDoors = new boolean[9];
	private boolean melzarsDoor = false;
	private boolean shipyardGate = false;
	private boolean tTwig = false;
	private boolean uTwig = false;
	private boolean zTwig = false;
	private boolean oTwig = false;
	private boolean bananaCrate = false;
	private boolean snailSlime = false;
	private boolean idPapers = false;
	private String topHalfOfGhostsAhoyFlag = "undyed";
	private String bottomHalfOfGhostsAhoyFlag = "undyed";
	private String skullOfGhostsAhoyFlag = "undyed";
	private String desiredTopHalfOfGhostsAhoyFlag = "black";
	private String desiredBottomHalfOfGhostsAhoyFlag = "black";
	private String desiredSkullOfGhostsAhoyFlag = "black";
	private boolean lobsterSpawned = false;
	private boolean petitionSigned = false;
	private boolean usedFreeGauntletsCharge = false;
	private boolean chronozonWind = false;
	private boolean chronozonWater = false;
	private boolean chronozonEarth = false;
	private boolean chronozonFire = false;
	private boolean northLever = false;
	private boolean northRoomLever = false;
	private boolean southLever = false;
	private boolean placedFireRune = false;
	private boolean placedAirRune = false;
	private boolean placedEarthRune = false;
	private boolean placedWaterRune = false;
	private boolean placedSword = false;
	private boolean placedArrow = false;
	private int railingsFixed = 0;
	private ArrayList<Integer> railings = new ArrayList<>();
	private boolean shotGrip = false;
	private boolean[] runeDrawWins = {false, false, false};
	private boolean justWonRuneDraw = false;
	private int bananaCrateCount = 0;
	private int ballistaIndex = -1;
	public int comboLockLetter1 = 1;
	public int comboLockLetter2 = 1;
	public int comboLockLetter3 = 1;
	public int comboLockLetter4 = 1;
	public boolean foxRight = true;
	public boolean chickenRight = true;
	public boolean grainRight = true;
	public boolean foxLeft = false;
	public boolean chickenLeft = false;
	public boolean grainLeft = false;
	public boolean receivedPacket = false;
	private boolean gazeOfSaradomin = false;
	public String templeKnightRiddleAnswer = "NULL";
	public boolean fillimanOption1 = false;
	public boolean fillimanOption2 = false;
	public boolean fillimanOption3 = false;
	public boolean showedFillimanFungus = false;
	public boolean natureSpiritFungusPlaced = false;
	public boolean natureSpiritSpellPlaced = false;
	private int ghastsSlain = 0;
	private boolean firstMortMyreBridgeFixed = false;
	private boolean secondMortMyreBridgeFixed = false;
	private boolean thirdMortMyreBridgeFixed = false;
	public boolean[] myrequeTalkedToBools = {false, false, false, false, false};
	public int plagueCitySoilSoftened = 0;
	public boolean triedPipeGrill = false;
	public boolean talkedToParents = false;
	public boolean allowedToSeeBravek = false;
	public boolean healedHangover = false;
	private boolean canTeleportArdougne = false;
	public boolean watchtowerDistracted = false;
	public boolean birdSeedThrown = false;
	private int vialGivenToChancy = 0;
	private int vialGivenToDaVinci = 0;
	private int vialGivenToHops = 0;
	private boolean blackCogPlaced = false;
	private boolean blueCogPlaced = false;
	private boolean redCogPlaced = false;
	private boolean whiteCogPlaced = false;
	public boolean blackCogQuenched = false;
	public boolean clockTowerGateOne = false;
	public boolean clockTowerGateTwo = false;
	public boolean ratsPoisoned = false;
	public boolean spokenToHarold = false;
	public boolean givenHaroldAle = false;
	public boolean givenHaroldSpecial = false;
	public int moneyWonFromHarold = 0;
	public boolean[] ballBools = {false, false, false, false, false};
	public boolean toldPathIsSafe = false;
	private Position gridStart = new Position(0, 0, 0);
	private Position gridMiddle = new Position(0, 0, 0);
	public boolean immuneToTraps = false;
	public boolean[] wellItemsDestroyed = {false, false, false, false};
	public boolean receivedCrateFood = false;
	public boolean receivedPaladinFood = false;
	public boolean takenWitchCat = false;
	public boolean dousedIbansTomb = false;
	public boolean killedKalrag = false;
	public boolean threwDollIntoWell = false;
	private boolean[] ibanDollElements = {false, false, false, false};
	public boolean spawnedStoneCircleLadder = false;
	public boolean givenMonkWater = false;
	//The Golem
        public int clayAddedToGolem = 0;
        public boolean[] statuesFacingCorrectly = {false, false, true, true};
        public boolean stolenThroneGems = false;
        private int statueStates[] = {0, 0, 1, 0};
	public boolean trapLeverPulled = false;
	public boolean trapLeverDisarmed = false;
	private boolean sidedWithLucien = false;
	private boolean sidedWithGuardians = false;
	public boolean guardianKilled = false;
	public int iceArrowChestIndex = Misc.randomMinusOne(6);
	//Creature of Fenkenstrain
	public boolean questionComparator = false;
	private boolean[] bodyCompletion = {false, false, false, false}; //0 - ARMS 1 - LEGS 2 - TORSO 3 - HEAD
	public boolean[] sewing101 = {false, false, false}; //0 - state 1 - needle 2 - thread
	public boolean headlessHunt = false;
	public boolean ghostlyGardener = false; //Set true after first time talking to gardener

	public QuestVariables(final Player player) {
		this.player = player;
	}

	public boolean isPhoenixGang() {
		return phoenixGang;
	}

	public void joinPhoenixGang(boolean bool) {
		if (this.isBlackArmGang()) {
			this.phoenixGang = false;
		} else {
			this.phoenixGang = bool;
		}
	}

	public boolean isBlackArmGang() {
		return blackArmGang;
	}

	public void joinBlackArmGang(boolean bool) {
		if (this.isPhoenixGang()) {
			this.blackArmGang = false;
		} else {
			this.blackArmGang = bool;
		}
	}
	
	public void setErnestLevers(int slot, boolean bool) {
		this.ernestLevers[slot] = bool;
		ErnestTheChicken.assessLeverConfig(player);
	}

	public boolean[] getErnestLevers() {
		return ernestLevers;
	}
	
	public void setErnestDoors(int slot, boolean bool) {
		this.ernestDoors[slot] = bool;
		if(bool)
			ErnestTheChicken.assessDoorConfig(player);
	}

	public boolean[] getErnestDoors() {
		return ernestDoors;
	}

	public boolean hasPlacedOTwig() {
		return oTwig;
	}

	public void setPlacedOTwig(boolean bool) {
		this.oTwig = bool;
	}

	public boolean hasPlacedZTwig() {
		return zTwig;
	}

	public void setPlacedZTwig(boolean bool) {
		this.zTwig = bool;
	}

	public boolean hasPlacedUTwig() {
		return uTwig;
	}

	public void setPlacedUTwig(boolean bool) {
		this.uTwig = bool;
	}

	public boolean hasPlacedTTwig() {
		return tTwig;
	}

	public void setPlacedTTwig(boolean bool) {
		this.tTwig = bool;
	}

	public boolean getShipyardGateOpen() {
		return shipyardGate;
	}

	public void setShipyardGateOpen(boolean bool) {
		this.shipyardGate = bool;
	}

	public boolean getMelzarsDoorUnlock() {
		return melzarsDoor;
	}

	public void setMelzarsDoorUnlock(boolean bool) {
		this.melzarsDoor = bool;
	}

	public boolean givenIdPapers() {
		return idPapers;
	}

	public void setGivenIdPapers(boolean bool) {
		this.idPapers = bool;
	}

	public boolean givenSnailSlime() {
		return snailSlime;
	}

	public void setGivenSnailSlime(boolean bool) {
		this.snailSlime = bool;
	}

	public boolean getBananaCrate() {
		return bananaCrate;
	}

	public void setBananaCrate(boolean bool) {
		this.bananaCrate = bool;
	}

	public int getBananaCrateCount() {
		return bananaCrateCount;
	}

	public void setBananaCrateCount(int count) {
		this.bananaCrateCount = count;
	}

	public String getTopHalfFlag() {
		return topHalfOfGhostsAhoyFlag;
	}

	public String getBottomHalfFlag() {
		return bottomHalfOfGhostsAhoyFlag;
	}

	public String getSkullFlag() {
		return skullOfGhostsAhoyFlag;
	}

	public String getDesiredTopHalfFlag() {
		return desiredTopHalfOfGhostsAhoyFlag;
	}

	public String getDesiredBottomHalfFlag() {
		return desiredBottomHalfOfGhostsAhoyFlag;
	}

	public String getDesiredSkullFlag() {
		return desiredSkullOfGhostsAhoyFlag;
	}

	public boolean lobsterSpawnedAndDead() {
		return lobsterSpawned;
	}

	public void setLobsterSpawnedAndDead(boolean bool) {
		this.lobsterSpawned = bool;
	}

	public boolean petitionSigned() {
		return petitionSigned;
	}

	public void setPetitionSigned(boolean bool) {
		this.petitionSigned = bool;
	}

	public void dyeGhostsAhoyFlag(String part, String color) {
		if (color == null || color.length() > 30) {
			return;
		}
		switch (part) {
			case "topHalf":
			case "top":
				this.topHalfOfGhostsAhoyFlag = color;
				return;
			case "bottomHalf":
			case "bottom":
				this.bottomHalfOfGhostsAhoyFlag = color;
				return;
			case "skull":
				this.skullOfGhostsAhoyFlag = color;
				return;
		}
	}

	public void setDesiredGhostsAhoyFlag(String part, String color) {
		if (color == null || color.length() > 30) {
			return;
		}
		switch (part) {
			case "topHalf":
			case "top":
				this.desiredTopHalfOfGhostsAhoyFlag = color;
				return;
			case "bottomHalf":
			case "bottom":
				this.desiredBottomHalfOfGhostsAhoyFlag = color;
				return;
			case "skull":
				this.desiredSkullOfGhostsAhoyFlag = color;
				return;
		}
	}

	public boolean usedFreeGauntletsCharge() {
		return usedFreeGauntletsCharge;
	}

	public void setHasUsedFreeGauntletsCharge(boolean bool) {
		this.usedFreeGauntletsCharge = bool;
	}

	public boolean hasHitChronozonWind() {
		return chronozonWind;
	}

	public void setHitChronozonWind(boolean bool) {
		this.chronozonWind = bool;
	}

	public boolean hasHitChronozonWater() {
		return chronozonWater;
	}

	public void setHitChronozonWater(boolean bool) {
		this.chronozonWater = bool;
	}

	public boolean hasHitChronozonEarth() {
		return chronozonEarth;
	}

	public void setHitChronozonEarth(boolean bool) {
		this.chronozonEarth = bool;
	}

	public boolean hasHitChronozonFire() {
		return chronozonFire;
	}

	public void setHitChronozonFire(boolean bool) {
		this.chronozonFire = bool;
	}

	public boolean northPerfectGoldMineLever() {
		return northLever;
	}

	public void setNorthPerfectGoldMineLever(boolean bool) {
		this.northLever = bool;
	}

	public boolean southPerfectGoldMineLever() {
		return southLever;
	}

	public void setSouthPerfectGoldMineLever(boolean bool) {
		this.southLever = bool;
	}

	public boolean northRoomPerfectGoldMineLever() {
		return northRoomLever;
	}

	public void setNorthRoomPerfectGoldMineLever(boolean bool) {
		this.northRoomLever = bool;
	}

	public boolean hasPlacedFireRune() {
		return placedFireRune;
	}

	public void setPlacedFireRune(boolean bool) {
		placedFireRune = bool;
	}

	public boolean hasPlacedWaterRune() {
		return placedWaterRune;
	}

	public void setPlacedWaterRune(boolean bool) {
		placedWaterRune = bool;
	}

	public boolean hasPlacedEarthRune() {
		return placedEarthRune;
	}

	public void setPlacedEarthRune(boolean bool) {
		placedEarthRune = bool;
	}

	public boolean hasPlacedAirRune() {
		return placedAirRune;
	}

	public void setPlacedAirRune(boolean bool) {
		placedAirRune = bool;
	}

	public boolean hasPlacedSword() {
		return placedSword;
	}

	public void setPlacedSword(boolean bool) {
		placedSword = bool;
	}

	public boolean hasPlacedArrow() {
		return placedArrow;
	}

	public void setPlacedArrow(boolean bool) {
		placedArrow = bool;
	}

	public int getRailingsFixed() {
		return this.railingsFixed;
	}

	public void setRailingsFixed(int set) {
		this.railingsFixed = set;
	}

	public void addRailingsFixed(int fixed) {
		railings.add(fixed);
	}

	public ArrayList<Integer> getRailingsArray() {
		return this.railings;
	}

	public boolean[] getRuneDrawWins() {
		return runeDrawWins;
	}

	public void setRuneDrawWins(int slot, boolean bool) {
		this.runeDrawWins[slot] = bool;
	}

	public boolean hasShotGrip() {
		return this.shotGrip;
	}

	public void setShotGrip(boolean bool) {
		this.shotGrip = bool;
	}

	public boolean justWonRuneDraw() {
		return justWonRuneDraw;
	}

	public void setJustWonRuneDraw(boolean bool) {
		this.justWonRuneDraw = bool;
	}

	public int getBallistaIndex() {
		return this.ballistaIndex;
	}

	public void setBallistaIndex(int set) {
		this.ballistaIndex = set;
	}

	public boolean isGazeOfSaradomin() {
		return this.gazeOfSaradomin;
	}

	public void setGazeOfSaradomin(boolean set) {
		this.gazeOfSaradomin = set;
	}

	public int getGhastsSlain() {
		return this.ghastsSlain;
	}

	public void setGhastsSlain(int set) {
		this.ghastsSlain = set;
	}

	public void setMortMyreBridgeFixed(int number, boolean set) {
		switch (number) {
			case 1:
				this.firstMortMyreBridgeFixed = set;
				return;
			case 2:
				this.secondMortMyreBridgeFixed = set;
				return;
			case 3:
				this.thirdMortMyreBridgeFixed = set;
				return;
		}
	}

	public boolean getMortMyreBridgeFixed(int number) {
		switch (number) {
			case 1:
				return this.firstMortMyreBridgeFixed;
			case 2:
				return this.secondMortMyreBridgeFixed;
			case 3:
				return this.thirdMortMyreBridgeFixed;
		}
		return false;
	}

	public boolean canTeleportArdougne() {
		return this.canTeleportArdougne;
	}

	public void setCanTeleportArdougne(boolean set) {
		this.canTeleportArdougne = set;
	}

	public void setVialGivenToChancy(int set) {
		this.vialGivenToChancy = set;
	}

	public void setVialGivenToDaVinci(int set) {
		this.vialGivenToDaVinci = set;
	}

	public void setVialGivenToHops(int set) {
		this.vialGivenToHops = set;
	}

	public int getVialGivenToChancy() {
		return this.vialGivenToChancy;
	}

	public int getVialGivenToDaVinci() {
		return this.vialGivenToDaVinci;
	}

	public int getVialGivenToHops() {
		return this.vialGivenToHops;
	}

	public boolean getBlueCogPlaced() {
		return this.blueCogPlaced;
	}

	public void setBlueCogPlaced(boolean set) {
		this.blueCogPlaced = set;
	}

	public boolean getBlackCogPlaced() {
		return this.blackCogPlaced;
	}

	public void setBlackCogPlaced(boolean set) {
		this.blackCogPlaced = set;
	}

	public boolean getRedCogPlaced() {
		return this.redCogPlaced;
	}

	public void setRedCogPlaced(boolean set) {
		this.redCogPlaced = set;
	}

	public boolean getWhiteCogPlaced() {
		return this.whiteCogPlaced;
	}

	public void setWhiteCogPlaced(boolean set) {
		this.whiteCogPlaced = set;
	}
	
	public Position getGridStart() {
		return this.gridStart;
	}
	
	public Position getGridMiddle() {
		return this.gridMiddle;
	}
	
	public int[] getStatueStates() {
            return this.statueStates;
        }
        
        public void setStatueStates(int index, int toSet) {
            this.statueStates[index] = toSet;
            TheGolem.assessConfigs(player);
        }
	
	public boolean[] getIbanDollElements() {
		return this.ibanDollElements;
	}
	
	public void setIbanDollElements(boolean set, int index) {
		this.ibanDollElements[index] = set;
	}
	
	public boolean getSidedWithLucien() {
		return this.sidedWithLucien;
	}
	
	public void setSidedWithLucien(boolean set) {
		this.sidedWithLucien = set;
	}
	
	public boolean getSidedWithGuardians() {
		return this.sidedWithGuardians;
	}
	
	public void setSidedWithGuardians(boolean set) {
		this.sidedWithGuardians = set;
	}
	
	public boolean getBodyCompletion() {
		if(this.bodyCompletion[0] && this.bodyCompletion[1] && this.bodyCompletion[2] && this.bodyCompletion[3]) {
			return true;
		}
		return false;
	}
	
	public void setBodyCompletion(int index, boolean bool) {
		this.bodyCompletion[index] = bool;
	}

}
