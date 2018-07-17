// 
// Decompiled by Procyon v0.5.30
// 

package org.spacehq.mc.protocol.packet.ingame.server;

import java.io.IOException;
import org.spacehq.packetlib.io.NetInput;
import org.spacehq.packetlib.io.NetOutput;
import org.spacehq.packetlib.packet.Packet;

public class ServerKeepAlivePacket implements Packet {

  private int id;

  private ServerKeepAlivePacket() {
  }

  public ServerKeepAlivePacket(final int id) {
    this.id = id;
  }

  public int getPingId() {
    return this.id;
  }

  @Override
  public void read(final NetInput in) throws IOException {
    this.id = in.readVarInt();
  }

  @Override
  public void write(final NetOutput out) throws IOException {
    out.writeVarInt(this.id);
  }

  @Override
  public boolean isPriority() {
    return false;
  }
}
