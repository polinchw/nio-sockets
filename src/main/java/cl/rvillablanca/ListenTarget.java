package cl.rvillablanca;

import java.nio.channels.SelectionKey;

/**
 * Created by polinchakb on 5/8/17.
 */
public class ListenTarget {

    private final SelectionKey key;

    public ListenTarget(SelectionKey key) {
        this.key = key;
    }
}
