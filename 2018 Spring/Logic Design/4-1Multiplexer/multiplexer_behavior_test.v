`timescale 1ns / 1ps

////////////////////////////////////////////////////////////////////////////////
// Company: 
// Engineer:
//
// Create Date:   16:20:47 04/04/2018
// Design Name:   multiplexer_behavior
// Module Name:   /csehome/calofmijuck/Desktop/multiplexer41/multiplexer_behavior_test.v
// Project Name:  multiplexer41
// Target Device:  
// Tool versions:  
// Description: 
//
// Verilog Test Fixture created by ISE for module: multiplexer_behavior
//
// Dependencies:
// 
// Revision:
// Revision 0.01 - File Created
// Additional Comments:
// 
////////////////////////////////////////////////////////////////////////////////

module multiplexer_behavior_test;

	// Inputs
	reg [3:0] X;
	reg [1:0] C;

	// Outputs
	wire Y;

	// Instantiate the Unit Under Test (UUT)
	multiplexer_behavior uut (
		.X(X), 
		.C(C), 
		.Y(Y)
	);

	initial for(X = 0; X < 16; X = X + 1) begin
		C = 2'b00;
		#100;
		
		C = 2'b01;
		#100;
			
		C = 2'b10;
		#100;
		
		C = 2'b11;
		#100;

	end
      
endmodule

