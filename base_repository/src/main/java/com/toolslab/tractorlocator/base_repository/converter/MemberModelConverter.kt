package com.toolslab.tractorlocator.base_repository.converter

import com.toolslab.tractorlocator.base_network.model.Member
import com.toolslab.tractorlocator.base_repository.model.CoordinateViewModel
import com.toolslab.tractorlocator.base_repository.model.DriverViewModel
import javax.inject.Inject

class MemberModelConverter @Inject constructor() : Converter<Member, DriverViewModel> {

    override fun convert(source: Member): DriverViewModel {
        val position = source.lastKnownPosition
        return DriverViewModel(source.firstName!!,
                position.timestamp!!,
                CoordinateViewModel(position.latitude!!, position.longitude!!))
    }

}
