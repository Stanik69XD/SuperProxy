// 
// Decompiled by Procyon v0.5.30
// 

package org.spacehq.mc.protocol.data.game;

public class Position {

  private int x;
  private int y;
  private int z;

  public Position(final int x, final int y, final int z) {
    this.x = x;
    this.y = y;
    this.z = z;
  }

  @Override
  public boolean equals(final Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || this.getClass() != o.getClass()) {
      return false;
    }
    final Position position = (Position) o;
    return this.x == position.x && this.y == position.y && this.z == position.z;
  }

  @Override
  public int hashCode() {
    int result = this.x;
    result = 31 * result + this.y;
    result = 31 * result + this.z;
    return result;
  }

  public int getX() {
    return x;
  }

  public void setX(int x) {
    this.x = x;
  }

  public int getY() {
    return y;
  }

  public void setY(int y) {
    this.y = y;
  }

  public int getZ() {
    return z;
  }

  public void setZ(int z) {
    this.z = z;
  }
}
