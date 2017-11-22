import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.List;

import static org.mockito.Mockito.verify;

/**
 * 运行这个测试类你会发现报错了，mock的对象为NULL，为此我们必须在基类中添加初始化mock的代码
 */
@SuppressWarnings("unchecked")
public class MockitoTest2 {
    @Mock
    private List mockList;

    public MockitoTest2() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void shorthand() {
        mockList.add(1);
        verify(mockList).add(1);
    }
}
