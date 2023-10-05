package emu.lunarcore.game.scene.entity;

import emu.lunarcore.data.excel.NpcMonsterExcel;
import emu.lunarcore.data.excel.StageExcel;
import emu.lunarcore.proto.MotionInfoOuterClass.MotionInfo;
import emu.lunarcore.proto.SceneEntityInfoOuterClass.SceneEntityInfo;
import emu.lunarcore.proto.SceneNpcMonsterInfoOuterClass.SceneNpcMonsterInfo;
import emu.lunarcore.proto.VectorOuterClass.Vector;
import emu.lunarcore.util.Position;
import lombok.Getter;
import lombok.Setter;

@Getter
public class EntityMonster implements GameEntity {
    @Setter private int entityId;
    @Setter private int worldLevel;
    @Setter private int groupId;
    @Setter private int instId;
    @Setter private int eventId;
    @Setter private int overrideStageId;
    
    private NpcMonsterExcel excel;
    private Position pos;
    private Position rot;
    
    public EntityMonster(NpcMonsterExcel excel, Position pos) {
        this.excel = excel;
        this.pos = pos;
        this.rot = new Position();
    }
    
    public int getStageId() {
        if (this.overrideStageId == 0) {
            return (this.getEventId() * 10) + worldLevel;
        } else {
            return this.overrideStageId;
        }
    }

    @Override
    public SceneEntityInfo toSceneEntityProto() {
        var monster = SceneNpcMonsterInfo.newInstance()
                .setWorldLevel(this.getWorldLevel())
                .setMonsterId(excel.getId())
                .setEventId(this.getEventId());

        var proto = SceneEntityInfo.newInstance()
                .setEntityId(this.getEntityId())
                .setGroupId(this.getGroupId())
                .setInstId(this.getInstId())
                .setMotion(MotionInfo.newInstance().setPos(getPos().toProto()).setRot(getRot().toProto()))
                .setNpcMonster(monster);

        return proto;
    }
}
