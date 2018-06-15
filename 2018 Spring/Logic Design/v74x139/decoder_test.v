`timescale 1ns / 1ps

////////////////////////////////////////////////////////////////////////////////
// Company: 
// Engineer:
//
// Create Date:   20:30:20 04/03/2018
// Design Name:   v3x8_decoder
// Module Name:   /csehome/calofmijuck/Desktop/v74x139/decoder_test.v
// Project Name:  v74x139
// Target Device:  
// Tool versions:  
// Description: 
//
// Verilog Test Fixture created by ISE for module: v3x8_decoder
//
// Dependencies:
// 
// Revision:
// Revision 0.01 - File Created
// Additional Comments:
// 
////////////////////////////////////////////////////////////////////////////////

module decoder_test;

	// Inputs
	reg A;
	reg B;
	reg C;

	// Outputs
	wire [7:0] Y;

	// Instantiate the Unit Under Test (UUT)
	v3x8_decoder uut (
		.A(A), 
		.B(B), 
		.C(C), 
		.Y(Y)
	);

	initial begin
		// Initialize Inputs
		A = 0;
		B = 0;
		C = 0;
		#100;
        
		A = 0;
		B = 0;
		C = 1;
		#100;
       
		A = 0;
		B = 1;
		C = 0;
		#100;
        
		A = 0;
		B = 1;
		C = 1;
		#100;
        
		A = 1;
		B = 0;
		C = 0;
		#100;
        
		A = 1;
		B = 0;
		C = 1;
		#100;
        
		A = 1;
		B = 1;
		C = 0;
		#100;
        
		A = 1;
		B = 1;
		C = 1;
		#100;
        
		
		// Add stimulus here

	end
      
endmodule

