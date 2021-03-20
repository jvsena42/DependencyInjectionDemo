package com.anushka.didemo

import dagger.Module
import dagger.Provides

@Module
class NCBatteryModule {
    @Provides
    fun providesBattery(nickelCadmiumBattery:NickelCadmiumBattery):Battery{
        return nickelCadmiumBattery
    }

}