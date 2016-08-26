package ghcvm.runtime.io;

import ghcvm.runtime.stg.StgTSO;
import ghcvm.runtime.stg.StgClosure;
import ghcvm.runtime.stg.StgContext;
import static ghcvm.runtime.RtsMessages.barf;

public class final StgByteArray extends StgClosure {
    public ByteBuffer buf;

    public StgArray(int n) {
        this(n, 0);
        // TODO: Perform initialization else where?
        // TODO: Handle pinned bytebuffers
        buf = ByteBuffer.allocateDirect(n);
    }

    public StgArray(int n, int alignment) {
        // TODO: Perform initialization else where?
        // TODO: Handle pinned bytebuffers
        // TODO: Handle aligned
        buf = ByteBuffer.allocateDirect(n);
    }

    // public byte get(int i) {
    //     return buf.get(i);
    // }

    // public void set(int i, byte val) {
    //     buf.put(i, val);
    // }

    @Override
    public void enter(StgContext context) {
        barf("StgByteArray object entered!");
    }

    // public int size() {
    //     return arr.length;
    // }
}
