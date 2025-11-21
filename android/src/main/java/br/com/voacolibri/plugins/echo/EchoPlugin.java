// Java puro

package br.com.voacolibri.plugins.echo;

import android.util.Log;
public class EchoPlugin {
  public String echo(String value) {
    Log.i("EchoPlugin", "Entrou no método echo com valor: " + value);
    return value;
  }

}
