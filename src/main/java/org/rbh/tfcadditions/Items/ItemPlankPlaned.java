package org.rbh.tfcadditions.Items;

import com.bioxx.tfc.Items.ItemPlank;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import org.rbh.tfcadditions.Core.TFCAdditionsTabs;
import org.rbh.tfcadditions.Reference.Names;
import org.rbh.tfcadditions.Reference.Reference;

import java.util.List;

/**
 * Created by raymondbh on 17.09.2015.
 */
public class ItemPlankPlaned extends ItemPlank {

    private IIcon[] icons = new IIcon[Names.WOOD_ALL.length];

    ItemPlankPlaned(){
        super();
        setCreativeTab(TFCAdditionsTabs.TFCAdditions_Tab);
        this.metaNames = Names.WOOD_ALL.clone();
    }

    @Override
    public IIcon getIconFromDamage(int meta)
    {
        return icons[meta];
    }

    @Override
    public void registerIcons(IIconRegister registerer)
    {
        for(int i = 0; i < Names.WOOD_ALL.length; i++) {
            icons[i] = registerer.registerIcon(Reference.ModID + ":" + "wood/"+Names.WOOD_ALL[i]+" Plank Planed");
        }
    }

    @Override
    public void getSubItems(Item par1, CreativeTabs par2CreativeTabs, List list)
    {
        for(int i = 0; i < Names.WOOD_ALL.length; i++) {
            list.add(new ItemStack(this,1,i));
        }
    }
}
