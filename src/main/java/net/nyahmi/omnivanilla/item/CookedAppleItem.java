
package net.nyahmi.omnivanilla.item;

import net.nyahmi.omnivanilla.OmnivanillaModElements;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.item.UseAction;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.Food;
import net.minecraft.client.util.ITooltipFlag;

import java.util.List;

@OmnivanillaModElements.ModElement.Tag
public class CookedAppleItem extends OmnivanillaModElements.ModElement {
	@ObjectHolder("omnivanilla:cooked_apple")
	public static final Item block = null;
	public CookedAppleItem(OmnivanillaModElements instance) {
		super(instance, 1);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}
	public static class FoodItemCustom extends Item {
		public FoodItemCustom() {
			super(new Item.Properties().group(ItemGroup.FOOD).maxStackSize(16)
					.food((new Food.Builder()).hunger(5).saturation(0.4f).setAlwaysEdible().build()));
			setRegistryName("cooked_apple");
		}

		@Override
		public int getUseDuration(ItemStack stack) {
			return 18;
		}

		@Override
		public UseAction getUseAction(ItemStack par1ItemStack) {
			return UseAction.EAT;
		}

		@Override
		public void addInformation(ItemStack itemstack, World world, List<ITextComponent> list, ITooltipFlag flag) {
			super.addInformation(itemstack, world, list, flag);
			list.add(new StringTextComponent("mmm baked apple~"));
		}
	}
}
