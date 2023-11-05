package emu.lunarcore.server.packet.send;

import emu.lunarcore.game.rogue.RogueBuffSelectMenu;
import emu.lunarcore.proto.RollRogueBuffScRspOuterClass.RollRogueBuffScRsp;
import emu.lunarcore.server.packet.BasePacket;
import emu.lunarcore.server.packet.CmdId;

public class PacketRollRogueBuffScRsp extends BasePacket {

    public PacketRollRogueBuffScRsp(RogueBuffSelectMenu selectMenu) {
        super(CmdId.RollRogueBuffScRsp);
        
        var data = RollRogueBuffScRsp.newInstance();
        
        if (selectMenu != null) {
            data.setRogueBuffSelectInfo(selectMenu.toProto());
        } else {
            data.setRetcode(1);
        }
        
        this.setData(data);
    }
}
