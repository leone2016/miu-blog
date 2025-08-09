package edu.miu.cs.cs425.mystudentmgmtapp;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.boot.web.context.WebServerApplicationContext;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Value;

import java.awt.Desktop;
import java.net.URI;
import java.util.concurrent.atomic.AtomicBoolean;

@Component
public class AutoOpenSwagger {
    private final AtomicBoolean opened = new AtomicBoolean(false);

    @Value("${server.servlet.context-path:}")
    private String contextPath;

    @EventListener(ApplicationReadyEvent.class)
    public void openSwagger(ApplicationReadyEvent e) {
        if (opened.getAndSet(true)) return;              // avoid reopening on devtools restart
        try {
            System.setProperty("java.awt.headless", "false");
            int port = ((WebServerApplicationContext) e.getApplicationContext())
                    .getWebServer().getPort();
            String base = "http://localhost:" + port + (contextPath == null ? "" : contextPath);
            Desktop.getDesktop().browse(new URI(base + "/swagger-ui.html"));
        } catch (Exception ignore) { }
    }
}
