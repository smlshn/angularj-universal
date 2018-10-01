package ch.swaechter.angularjuniversal.v8renderer;

import ch.swaechter.angularjuniversal.renderer.engine.RenderEngine;
import ch.swaechter.angularjuniversal.renderer.engine.RenderEngineFactory;
import org.junit.Assert;
import org.junit.Test;

/**
 * This class provides a test to guarantee the factory functionality.
 *
 * @author Simon Wächter
 */
public class V8RenderEngineFactoryTest {

    /**
     * Test the render engine factory functionality.
     */
    @Test
    public void testRenderEngineFactory() {
        RenderEngineFactory renderEngineFactory = new V8RenderEngineFactory();
        RenderEngine renderEngine = renderEngineFactory.createRenderEngine();
        Assert.assertEquals(V8RenderEngine.class.getName(), renderEngine.getClass().getName());
    }
}
