`timescale 1ns / 1ps
//////////////////////////////////////////////////////////////////////////////////
// Company: 
// Engineer: 
// 
// Create Date:    15:56:38 04/04/2018 
// Design Name: 
// Module Name:    multiplexer_dataflow 
// Project Name: 
// Target Devices: 
// Tool versions: 
// Description: 
//
// Dependencies: 
//
// Revision: 
// Revision 0.01 - File Created
// Additional Comments: 
//
//////////////////////////////////////////////////////////////////////////////////
module multiplexer_dataflow(
    input [3:0] X,
    input [1:0] C,
    output Y
    );

	 assign Y = (C == 2'b00) ? X[0] : 
					(C == 2'b01) ? X[1] :
					(C == 2'b10) ? X[2] : X[3];

endmodule
