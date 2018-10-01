package org.wecancodeit.reviews;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class ReviewRepositoryTest {

	private long reviewId = 1L;
	private Review review = new Review(reviewId, "review name", "review description");

	@Test
	public void shouldFindAReview() {
		ReviewRepository underTest = new ReviewRepository(review);
		Review result = underTest.findOne(reviewId);
		assertThat(result, is(review));
	}

}
