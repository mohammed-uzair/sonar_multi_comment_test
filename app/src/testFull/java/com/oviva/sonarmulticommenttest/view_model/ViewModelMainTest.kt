package com.oviva.sonarmulticommenttest.view_model

import org.junit.Assert
import org.junit.Test
import kotlinx.coroutines.test.runTest
import app.cash.turbine.test

class ViewModelMainTest {
    private lateinit var subject: ViewModelMain

    @Test
    fun `verify when onBackPressed clicked NavigateBack event is fired correctly`() =
        runTest {
            // Given
            val expected = ViewModelMainNavigation.NavigateBack
            subject = initiateSubject()

            // When
            subject.navigation().test {
                subject.onBackPressed()

                // Then
                val item = expectMostRecentItem()
                Assert.assertEquals(expected, item)
            }
        }

    private fun initiateSubject(): ViewModelMain =
        ViewModelMain()
}
