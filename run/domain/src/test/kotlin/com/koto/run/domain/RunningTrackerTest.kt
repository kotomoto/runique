package com.koto.run.domain

import com.koto.test.LocationObserverFake
import kotlinx.coroutines.test.TestDispatcher
import kotlinx.coroutines.test.TestScope
import org.junit.jupiter.api.BeforeEach

class RunningTrackerTest {

    private lateinit var runningTracker: RunningTracker
    private lateinit var locationObserverFake: LocationObserverFake

    private lateinit var testDispatcher: TestDispatcher
    private lateinit var testScope: TestScope

    @BeforeEach
    fun setUp() {
        // todo
//        runningTracker = RunningTracker()
    }
}
