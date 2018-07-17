// 
// Decompiled by Procyon v0.5.30
// 

package org.spacehq.mc.protocol.packet.ingame.server.entity;

import java.io.IOException;
import org.spacehq.mc.protocol.data.game.ItemStack;
import org.spacehq.mc.protocol.util.NetUtil;
import org.spacehq.packetlib.io.NetInput;
import org.spacehq.packetlib.io.NetOutput;
import org.spacehq.packetlib.packet.Packet;

public class ServerEntityEquipmentPacket implements Packet {

  private int entityId;
  private int slot;
  private ItemStack item;

  private ServerEntityEquipmentPacket() {
  }

  public ServerEntityEquipmentPacket(final int entityId, final int slot, final ItemStack item) {
    this.entityId = entityId;
    this.slot = slot;
    this.item = item;
  }

  public int getEntityId() {
    return this.entityId;
  }

  public int getSlot() {
    return this.slot;
  }

  public ItemStack getItem() {
    return this.item;
  }

  @Override
  public void read(final NetInput in) throws IOException {
    this.entityId = in.readVarInt();
    this.slot = in.readShort();
    this.item = NetUtil.readItem(in);
  }

  @Override
  public void write(final NetOutput out) throws IOException {
    out.writeVarInt(this.entityId);
    out.writeShort(this.slot);
    NetUtil.writeItem(out, this.item);
  }

  @Override
  public boolean isPriority() {
    return false;
  }
}
