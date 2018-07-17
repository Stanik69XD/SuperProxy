// 
// Decompiled by Procyon v0.5.30
// 

package org.spacehq.mc.protocol.packet.ingame.client.window;

import java.io.IOException;
import org.spacehq.packetlib.io.NetInput;
import org.spacehq.packetlib.io.NetOutput;
import org.spacehq.packetlib.packet.Packet;

public class ClientCloseWindowPacket implements Packet {

  private int windowId;

  private ClientCloseWindowPacket() {
  }

  public ClientCloseWindowPacket(final int windowId) {
    this.windowId = windowId;
  }

  public int getWindowId() {
    return this.windowId;
  }

  @Override
  public void read(final NetInput in) throws IOException {
    this.windowId = in.readByte();
  }

  @Override
  public void write(final NetOutput out) throws IOException {
    out.writeByte(this.windowId);
  }

  @Override
  public boolean isPriority() {
    return false;
  }
}
