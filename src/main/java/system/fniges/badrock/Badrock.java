package system.fniges.badrock;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.event.registry.RegistryEntryAddedCallback;
import net.minecraft.block.BlockState;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import system.fniges.badrock.mixin.AbstractBlock$AbstractBlockStateMixin;
import system.fniges.badrock.mixin.AbstractBlockMixin;

public class Badrock implements ModInitializer {

    @Override
    public void onInitialize() {
        RegistryEntryAddedCallback.event(Registry.BLOCK).register((rawId, id, block) -> {
            if (id.equals(new Identifier("bedrock"))) {
                AbstractBlockMixin a = ((AbstractBlockMixin) block);
                a.setResistance(0);
                a.setLootTableId(null);

                for (BlockState state : block.getStateManager().getStates()) {
                    AbstractBlock$AbstractBlockStateMixin b = ((AbstractBlock$AbstractBlockStateMixin) state);
                    b.setToolRequired(true);
                    b.setHardness(1);
                }
            }
        });
    }
}
