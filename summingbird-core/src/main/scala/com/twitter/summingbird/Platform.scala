/*
Copyright 2013 Twitter, Inc.

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/

package com.twitter.summingbird

trait Service[P, K, V]
trait Store[P, K, V]

/**
  * Could be an Injection, or nothing for in-memory.
  */
trait Serialization[P, T]

/**
  * Base trait for summingbird compilers.
  */

trait Platform[P <: Platform[P]] {
  def run[K, V](completed: Summer[P, K, V]): Unit
}
