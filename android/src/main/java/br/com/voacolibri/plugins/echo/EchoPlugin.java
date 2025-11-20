package br.com.voacolibri.plugins.echo;

import com.getcapacitor.Logger;

public class EchoPlugin {

    public String echo(String value) {
        Logger.info("Echo", value);
        return value;
    }
}
