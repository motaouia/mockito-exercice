package org.medmota.exercicemockito.injectmocks;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class ArticleManagerTest {
	@Mock
	private User user;

	@Mock
	private ArticleDatabase database;

	@InjectMocks
	private ArticleManager manager;

	@Test
	void ensureInjectMockWorks() {
		// calls addListener with an instance of ArticleListener

		manager.initialize();
		// TODO verify that addListener was called with any (instance) of
		// ArticleListener.class

		// TODO
	}

}
