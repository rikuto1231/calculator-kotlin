package org.example.controller

import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/calculator")
class CalculatorController {

    @PostMapping("/calculate")
    fun calculate(@RequestBody request: CalculationRequest): CalculationResponse {
        return try {
            val result = when (request.operation) {
                "+" -> request.a + request.b
                "-" -> request.a - request.b
                "*" -> request.a * request.b
                "/" -> {
                    if (request.b == 0.0) {
                        throw IllegalArgumentException("ゼロで割ることはできません")
                    }
                    request.a / request.b
                }
                else -> throw IllegalArgumentException("サポートされていない演算子: ${request.operation}")
            }
            CalculationResponse(success = true, result = result, error = null)
        } catch (e: Exception) {
            CalculationResponse(success = false, result = null, error = e.message ?: "計算エラー")
        }
    }

    @GetMapping("/history")
    fun getHistory(): List<CalculationHistory> {
        // 実際のアプリケーションではデータベースから取得
        return listOf(
            CalculationHistory("5 + 3", 8.0),
            CalculationHistory("10 - 4", 6.0),
            CalculationHistory("6 * 7", 42.0),
            CalculationHistory("20 / 4", 5.0)
        )
    }
}

data class CalculationRequest(
    val a: Double,
    val b: Double,
    val operation: String
)

data class CalculationResponse(
    val success: Boolean,
    val result: Double?,
    val error: String?
)

data class CalculationHistory(
    val expression: String,
    val result: Double
) 