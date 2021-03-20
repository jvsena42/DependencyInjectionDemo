package com.anushka.didemo

import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [MemoryCardModule::class,NCBatteryModule::class])
interface SmartPhoneComponent {
//   fun getSmartPhone() : SmartPhone
   /*Serve para não precisar criar uma função get e chamar na activity*/
   fun inject(mainActivity: MainActivity)
}