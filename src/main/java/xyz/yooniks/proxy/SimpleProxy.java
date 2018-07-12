package xyz.yooniks.proxy;

import org.spacehq.mc.protocol.MinecraftProtocol;
import org.spacehq.packetlib.Server;
import org.spacehq.packetlib.tcp.TcpSessionFactory;
import xyz.yooniks.proxy.user.ProxyUserManager;

public class SimpleProxy extends JavaProxy {

  private final Server server;

  public SimpleProxy(String name, String version, ProxyUserManager userManager,
      Server server, String... authors) {
    super(name, version, userManager, authors);

    this.server = new Server("0.0.0.0", 2137, MinecraftProtocol.class, new TcpSessionFactory());
  }

  @Override
  public void onEnable() {
    this.server.bind();
  }

  @Override
  public Server getServer() {
    return this.getServer();
  }
}