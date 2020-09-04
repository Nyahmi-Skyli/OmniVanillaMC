
package net.nyahmi.omnivanilla.item;

import net.nyahmi.omnivanilla.OmnivanillaModElements;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.UseAction;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.Food;

@OmnivanillaModElements.ModElement.Tag
public class ChocolateAppleItem extends OmnivanillaModElements.ModElement {
	@ObjectHolder("omnivanilla:chocolate_apple")
	public static final Item block = null;
	public ChocolateAppleItem(OmnivanillaModElements instance) {
		super(instance, 12);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}
	public static class FoodItemCustom extends Item {
		public FoodItemCustom() {
			super(new Item.Properties().group(ItemGroup.FOOD).maxStackSize(16)
					.food((new Food.Builder()).hunger(6).saturation(0.2f).setAlwaysEdible().build()));
			setRegistryName("chocolate_apple");
		}

		@Override
		public UseAction getUseAction(ItemStack par1ItemStack) {
			return UseAction.EAT;
		}
	}
}
