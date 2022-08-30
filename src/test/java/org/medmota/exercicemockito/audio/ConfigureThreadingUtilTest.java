package org.medmota.exercicemockito.audio;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.only;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class ConfigureThreadingUtilTest {

	@Mock
	MyApplication myApplication;

	@Test
	void ensureThatThreadPoolCanBeConfigured() {
		// mock MyApplication
		assertNotNull(myApplication);
		// call ConfigureThreadingUtil.configureThreadPool
		ConfigureThreadingUtil.configureThreadPool(myApplication);
		// verify that getNumberOfThreads was the only one called on app
		verify(myApplication, times(1)).getNumberOfThreads();
		//or You can use
		verify(myApplication, only()).getNumberOfThreads();
	}

}
