package com.github.amitsureshchandra.urlshortner.repo

import com.github.amitsureshchandra.urlshortner.entity.UrlMap
import org.springframework.data.repository.CrudRepository
import java.util.UUID

interface UrlRepo : CrudRepository<UrlMap, UUID>