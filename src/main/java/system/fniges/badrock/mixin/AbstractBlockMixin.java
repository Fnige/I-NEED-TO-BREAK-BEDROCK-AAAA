package system.fniges.badrock.mixin;

import net.minecraft.block.AbstractBlock;
import net.minecraft.util.Identifier;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(AbstractBlock.class)
public interface AbstractBlockMixin {

    @Mutable @Accessor void setResistance(float resistance);
    @Mutable @Accessor void setLootTableId(Identifier id);
}
