package keyCraft.events;

import keyCraft.keyCore;
import keyCraft.blocks.angelCrop;
import keyCraft.blocks.dogWoodSapling;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.Event.Result;
import net.minecraftforge.event.entity.player.BonemealEvent;




public class keyCraft_EventBonemeal {

    @ForgeSubscribe
    public void onUseBonemeal(BonemealEvent event)
    {
    if (event.ID == keyCore.dogWoodSapling.blockID)
    {
        if (!event.world.isRemote)
        {
                ((dogWoodSapling)keyCore.dogWoodSapling).growTree(event.world, event.X, event.Y, event.Z, event.world.rand);
                event.setResult(Result.ALLOW);
        }
    }   
    
    	if(event.world.getBlockId(event.X, event.Y, event.Z)== keyCore.angelCrop.blockID)
    {
    			((angelCrop)keyCore.angelCrop).fertilize(event.world, event.X, event.Y, event.Z);
    			event.setResult(Result.ALLOW);
    }
}
}
    
    
    
    


