#version 150

uniform sampler2D DiffuseSampler;

in vec2 texCoord;

out vec4 fragColor;

void main() {
    vec2 uv = texCoord;
    
    float strength = 0.02;
    float freq = 20.0;
    float phase = sin(uv.x * 10.0 + uv.y * 10.0);
    vec2 distortion = vec2(
        sin(uv.y * freq + phase) * strength,
        sin(uv.x * freq + phase) * strength
    );
    
    vec2 distortedUV = uv + distortion;
    distortedUV = clamp(distortedUV, 0.0, 1.0);
    
    vec4 color = texture(DiffuseSampler, distortedUV);
    fragColor = vec4(color.rgb, 1.0);
}