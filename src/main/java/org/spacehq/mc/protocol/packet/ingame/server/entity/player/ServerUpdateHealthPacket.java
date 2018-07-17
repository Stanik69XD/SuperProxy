// 
// Decompiled by Procyon v0.5.30
// 

package org.spacehq.mc.protocol.packet.ingame.server.entity.player;

import java.io.IOException;
import org.spacehq.packetlib.io.NetInput;
import org.spacehq.packetlib.io.NetOutput;
import org.spacehq.packetlib.packet.Packet;

public class ServerUpdateHealthPacket implements Packet {

  private float health;
  private int food;
  private float saturation;

  private ServerUpdateHealthPacket() {
  }

  public ServerUpdateHealthPacket(final float health, final int food, final float saturation) {
    this.health = health;
    this.food = food;
    this.saturation = saturation;
  }

  public float getHealth() {
    return this.health;
  }

  public int getFood() {
    return this.food;
  }

  public float getSaturation() {
    return this.saturation;
  }

  @Override
  public void read(final NetInput in) throws IOException {
    this.health = in.readFloat();
    this.food = in.readVarInt();
    this.saturation = in.readFloat();
  }

  @Override
  public void write(final NetOutput out) throws IOException {
    out.writeFloat(this.health);
    out.writeVarInt(this.food);
    out.writeFloat(this.saturation);
  }

  @Override
  public boolean isPriority() {
    return false;
  }
}
