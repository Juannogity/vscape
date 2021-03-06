package com.rs2.model.content;

import com.rs2.Constants;
import com.rs2.model.players.Player;

/**
 * By Mikey` of Rune-Server
 */
public class Emotes {

	private Player player;

	public Emotes(Player player) {
		this.player = player;
	}

	public enum EMOTE
	{
		YES(855, 168),
		NO(856, 169),
		THINK(857, 162),
		BOW(858, 164),
		ANGRY(859, 167),
		CRY(860, 161),
		LAUGTH(861, 170),
		CHEER(862, 171),
		WAVE(863, 163),
		BECKON(864, 165),
		CLAP(865, 172),
		DANCE(866, 166),
		PANIC(2105, 52050),
		JIG(2106, 52051),
		SPIN(2107, 52052),
		HEADBANG(2108, 52053),
		JOYJUMP(2109, 52054),
		RASPBERRY(2110, 52055),
		YAWN(2111, 52056),
		SALUTE(2112, 52057),
		SHRUG(2113, 52058),
		BLOWKISS(0x558, 43092, 574),
		GLASSBOX(1131, 2155),
		CLIMBROPE(1130, 25103),
		LEAN(1129, 25106),
		GLASSWALL(1128, 2154),
		GOBLINBOW(2127, 52071),
		GOBLINDANCE(2128, 52072),
		SCARED(2836, 59062),
		ZOMBIEWALK(3544, 72032),
		ZOMBIEDANCE(3543, 72033),
		RABBITHOP(6111, 72254);
		
		private int emoteId;
		private int buttonId;
		private int graphicId;
		
		EMOTE(int emoteId, int buttonId) {
			this.emoteId = emoteId;
			this.buttonId = buttonId;
		}
		
		EMOTE(int emoteId, int buttonId, int graphicId) {
			this.emoteId = emoteId;
			this.buttonId = buttonId;
			this.graphicId = graphicId;
		}
		
		public static EMOTE forButtonId(int button) {
			for (EMOTE emote : EMOTE.values())
					if (button == emote.buttonId)
						return emote;
			return null;
		}
	}

	public enum EMOTEENHANCER
	{
		POWDEREDWIG(EMOTE.ANGRY, Constants.HAT, 10392, 5315, 0, 0),
		SLEEPINGCAP(EMOTE.YAWN, Constants.HAT, 10398, 5313, 277, 190),
		FLAREDTROUSERS(EMOTE.DANCE, Constants.LEGS, 10394, 5316, 0, 0),
		PANTALOONS(EMOTE.BOW, Constants.LEGS, 10396, 5312, 0, 0);
		
		private EMOTE emote;
		private int slot;
		private int item;
		private int animationId;
		private int graphicId;
		private int graphicDelay;
		
		EMOTEENHANCER(EMOTE emote, int slot, int item, int animationId, int graphicId, int graphicDelay) {
			this.emote = emote;
			this.slot = slot;
			this.item = item;
			this.animationId = animationId;
			this.graphicId = graphicId;
			this.graphicDelay = graphicDelay;
		}
		
		public static EMOTEENHANCER forEmote(EMOTE emote) {
			for (EMOTEENHANCER emoteE : EMOTEENHANCER.values())
					if (emote == emoteE.emote)
						return emoteE;
			return null;
		}
	}
	
	public void performEmote(EMOTE emote) {
		int anim = emote.emoteId;
		int graphic = emote.graphicId;
		int graphicDelay = 0;
		EMOTEENHANCER emoteE = EMOTEENHANCER.forEmote(emote);
		if(emoteE != null)
		{
			if(player.getEquipment().getId(emoteE.slot) == emoteE.item)
			{
				anim = emoteE.animationId;
				graphic = emoteE.graphicId;
				graphicDelay = emoteE.graphicDelay;
			}
		}
		player.getMovementHandler().reset();
		player.getUpdateFlags().sendAnimation(anim, 0);
		if(graphic > 0)
		{
			player.getUpdateFlags().sendGraphic(graphic, graphicDelay);
		}
	}
	
	public boolean activateEmoteButton(int buttonId) {
		EMOTE emote = EMOTE.forButtonId(buttonId);
		if(emote != null)
		{
			performEmote(emote);
			return true;
		}
		return false;
	}

}
