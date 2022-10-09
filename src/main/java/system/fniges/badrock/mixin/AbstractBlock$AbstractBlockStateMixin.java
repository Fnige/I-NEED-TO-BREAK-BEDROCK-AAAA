package system.fniges.badrock.mixin;

import net.minecraft.block.AbstractBlock;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(AbstractBlock.AbstractBlockState.class)
public interface AbstractBlock$AbstractBlockStateMixin {

    @Mutable @Accessor void setToolRequired(boolean bool);
    @Mutable @Accessor void setHardness(float hardness);
}
