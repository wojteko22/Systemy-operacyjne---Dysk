import archiwum.FCFS;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * @author Wojciech Okoński
 *         created on 06.04.2016 r.
 */
public class FCFSTest extends AbstractTest {
    @org.junit.Test
    public void calculate() throws Exception {
        assertThat(new FCFS(queue).calculate(), is(644));
        assertThat(new FCFS(queue2).calculate(), is(7081));
    }



}