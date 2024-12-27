package net.mcreator.radiant.client.gui;

import net.neoforged.neoforge.network.PacketDistributor;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.radiant.world.inventory.TransformationSurgeGUIMenu;
import net.mcreator.radiant.network.TransformationSurgeGUIButtonMessage;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class TransformationSurgeGUIScreen extends AbstractContainerScreen<TransformationSurgeGUIMenu> {
	private final static HashMap<String, Object> guistate = TransformationSurgeGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_air;
	Button button_smoke;
	Button button_fire;
	Button button_glass;
	Button button_wood;
	Button button_blood;
	Button button_oil;
	Button button_metal;
	Button button_stone;
	Button button_meat;

	public TransformationSurgeGUIScreen(TransformationSurgeGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 191;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = ResourceLocation.parse("radiant:textures/screens/transformation_surge_gui.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics, mouseX, mouseY, partialTicks);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
	}

	@Override
	public void init() {
		super.init();
		button_air = Button.builder(Component.translatable("gui.radiant.transformation_surge_gui.button_air"), e -> {
			if (true) {
				PacketDistributor.sendToServer(new TransformationSurgeGUIButtonMessage(0, x, y, z));
				TransformationSurgeGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 27, this.topPos + 16, 40, 20).build();
		guistate.put("button:button_air", button_air);
		this.addRenderableWidget(button_air);
		button_smoke = Button.builder(Component.translatable("gui.radiant.transformation_surge_gui.button_smoke"), e -> {
			if (true) {
				PacketDistributor.sendToServer(new TransformationSurgeGUIButtonMessage(1, x, y, z));
				TransformationSurgeGUIButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}).bounds(this.leftPos + 16, this.topPos + 43, 51, 20).build();
		guistate.put("button:button_smoke", button_smoke);
		this.addRenderableWidget(button_smoke);
		button_fire = Button.builder(Component.translatable("gui.radiant.transformation_surge_gui.button_fire"), e -> {
			if (true) {
				PacketDistributor.sendToServer(new TransformationSurgeGUIButtonMessage(2, x, y, z));
				TransformationSurgeGUIButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}).bounds(this.leftPos + 21, this.topPos + 70, 46, 20).build();
		guistate.put("button:button_fire", button_fire);
		this.addRenderableWidget(button_fire);
		button_glass = Button.builder(Component.translatable("gui.radiant.transformation_surge_gui.button_glass"), e -> {
			if (true) {
				PacketDistributor.sendToServer(new TransformationSurgeGUIButtonMessage(3, x, y, z));
				TransformationSurgeGUIButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		}).bounds(this.leftPos + 16, this.topPos + 97, 51, 20).build();
		guistate.put("button:button_glass", button_glass);
		this.addRenderableWidget(button_glass);
		button_wood = Button.builder(Component.translatable("gui.radiant.transformation_surge_gui.button_wood"), e -> {
			if (true) {
				PacketDistributor.sendToServer(new TransformationSurgeGUIButtonMessage(4, x, y, z));
				TransformationSurgeGUIButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		}).bounds(this.leftPos + 21, this.topPos + 124, 46, 20).build();
		guistate.put("button:button_wood", button_wood);
		this.addRenderableWidget(button_wood);
		button_blood = Button.builder(Component.translatable("gui.radiant.transformation_surge_gui.button_blood"), e -> {
			if (true) {
				PacketDistributor.sendToServer(new TransformationSurgeGUIButtonMessage(5, x, y, z));
				TransformationSurgeGUIButtonMessage.handleButtonAction(entity, 5, x, y, z);
			}
		}).bounds(this.leftPos + 119, this.topPos + 16, 51, 20).build();
		guistate.put("button:button_blood", button_blood);
		this.addRenderableWidget(button_blood);
		button_oil = Button.builder(Component.translatable("gui.radiant.transformation_surge_gui.button_oil"), e -> {
			if (true) {
				PacketDistributor.sendToServer(new TransformationSurgeGUIButtonMessage(6, x, y, z));
				TransformationSurgeGUIButtonMessage.handleButtonAction(entity, 6, x, y, z);
			}
		}).bounds(this.leftPos + 118, this.topPos + 43, 40, 20).build();
		guistate.put("button:button_oil", button_oil);
		this.addRenderableWidget(button_oil);
		button_metal = Button.builder(Component.translatable("gui.radiant.transformation_surge_gui.button_metal"), e -> {
			if (true) {
				PacketDistributor.sendToServer(new TransformationSurgeGUIButtonMessage(7, x, y, z));
				TransformationSurgeGUIButtonMessage.handleButtonAction(entity, 7, x, y, z);
			}
		}).bounds(this.leftPos + 118, this.topPos + 70, 51, 20).build();
		guistate.put("button:button_metal", button_metal);
		this.addRenderableWidget(button_metal);
		button_stone = Button.builder(Component.translatable("gui.radiant.transformation_surge_gui.button_stone"), e -> {
			if (true) {
				PacketDistributor.sendToServer(new TransformationSurgeGUIButtonMessage(8, x, y, z));
				TransformationSurgeGUIButtonMessage.handleButtonAction(entity, 8, x, y, z);
			}
		}).bounds(this.leftPos + 119, this.topPos + 97, 51, 20).build();
		guistate.put("button:button_stone", button_stone);
		this.addRenderableWidget(button_stone);
		button_meat = Button.builder(Component.translatable("gui.radiant.transformation_surge_gui.button_meat"), e -> {
			if (true) {
				PacketDistributor.sendToServer(new TransformationSurgeGUIButtonMessage(9, x, y, z));
				TransformationSurgeGUIButtonMessage.handleButtonAction(entity, 9, x, y, z);
			}
		}).bounds(this.leftPos + 119, this.topPos + 124, 46, 20).build();
		guistate.put("button:button_meat", button_meat);
		this.addRenderableWidget(button_meat);
	}
}
