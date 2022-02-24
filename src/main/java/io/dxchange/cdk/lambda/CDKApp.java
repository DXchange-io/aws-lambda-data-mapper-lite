package io.dxchange.cdk.lambda;

import software.amazon.awscdk.App;
import software.amazon.awscdk.Tags;

public class CDKApp {
    public static void main(final String[] args) {

        var app = new App();
        var appName = "dxmapperlite";
        Tags.of(app).add("project", "DX Mapper lite Lambda");
        Tags.of(app).add("environment", "development");
        Tags.of(app).add("application", appName);

        var httpAPIGatewayIntegration = true;
        new CDKStack(app, appName, true);
        app.synth();
    }
}
