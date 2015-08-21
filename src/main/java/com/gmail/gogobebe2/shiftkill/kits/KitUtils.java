package com.gmail.gogobebe2.shiftkill.kits;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class KitUtils {
    private static final ItemStack HEALING_SPLASH_POTION = CREATE_HEALING_SPLASH_POTION();
    private static final ItemStack HEALING_II_SPLASH_POTION = CREATE_HEALING_II_SPLASH_POTION();
    private static final ItemStack REGEN_SPLASH_POTION_EXTENDED = CREATE_REGEN_SPLASH_POTION_EXTENDED();

    private static ItemStack CREATE_HEALING_SPLASH_POTION() {
        final short HEALING_SPLASH_POTION_TYPE = 8197;
        ItemStack healingSplashPotion = new ItemStack(Material.POTION, 1);
        healingSplashPotion.setDurability(HEALING_SPLASH_POTION_TYPE);
        return healingSplashPotion;
    }

    private static ItemStack CREATE_HEALING_II_SPLASH_POTION() {
        final short HEALING_II_SPLASH_POTION_TYPE = 16421;
        ItemStack healthIISplashPotion = new ItemStack(Material.POTION, 1);
        healthIISplashPotion.setDurability(HEALING_II_SPLASH_POTION_TYPE);
        return healthIISplashPotion;
    }

    private static ItemStack CREATE_REGEN_SPLASH_POTION_EXTENDED() {
        final short REGEN_SPLASH_POTION_EXTENDED_TYPE = 16449;
        ItemStack potion = new ItemStack(Material.POTION, 1);
        potion.setDurability(REGEN_SPLASH_POTION_EXTENDED_TYPE);
        return potion;
    }

    protected static ItemStack getHealingSplashPotion(int amount) {
        ItemStack potion = HEALING_SPLASH_POTION.clone();
        potion.setAmount(amount);
        return potion;
    }

    protected static ItemStack getHealingIISplashPotion(int amount) {
        ItemStack potion = HEALING_II_SPLASH_POTION.clone();
        potion.setAmount(amount);
        return potion;
    }

    protected static ItemStack getRegenSplashPotionExtended(int amount) {
        ItemStack potion = REGEN_SPLASH_POTION_EXTENDED.clone();
        potion.setAmount(amount);
        return potion;
    }

    protected static ItemStack getRandomDiamondArmourPiece() {
        Material armourPieceType;
        switch ((int) (Math.random() * 4 + 1)) {
            case 1: armourPieceType = Material.DIAMOND_HELMET; break;
            case 2: armourPieceType = Material.DIAMOND_CHESTPLATE; break;
            case 3: armourPieceType = Material.DIAMOND_LEGGINGS; break;
            default: armourPieceType = Material.DIAMOND_BOOTS;
        }
        return new ItemStack(armourPieceType, 1);
    }

    protected static ItemStack getRandomChainmailArmourPiece() {
        Material armourPieceType;
        switch ((int) (Math.random() * 4 + 1)) {
            case 1: armourPieceType = Material.CHAINMAIL_HELMET; break;
            case 2: armourPieceType = Material.CHAINMAIL_CHESTPLATE; break;
            case 3: armourPieceType = Material.CHAINMAIL_LEGGINGS; break;
            default: armourPieceType = Material.CHAINMAIL_BOOTS;
        }
        return new ItemStack(armourPieceType, 1);
    }
}
