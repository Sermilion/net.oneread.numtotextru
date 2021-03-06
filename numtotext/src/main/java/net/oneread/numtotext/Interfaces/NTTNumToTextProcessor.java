package net.oneread.numtotext.Interfaces;

import java.util.List;

/**
 * ---------------------------------------------------
 * Created by Sermilion on 14/12/2016.
 * Project: Library
 * ---------------------------------------------------
 * <a href="http://www.ucomplex.org">ucomplex.org</a>
 * <a href="http://www.github.com/sermilion>github</a>
 * ---------------------------------------------------
 */

public interface NTTNumToTextProcessor {
    List<String> process(List<Long> items);
}
